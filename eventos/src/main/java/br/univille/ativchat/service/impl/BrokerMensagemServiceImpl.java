package br.univille.ativchat.service.impl;

import java.util.List;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClient;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClientBuilder;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

import br.univille.ativchat.model.Mensagem;
import br.univille.ativchat.service.BrokerMensagemService;

public class BrokerMensagemServiceImpl implements BrokerMensagemService {
    String topicName = "topic-chat";
    String serviceBus = "sb-das12025-test-brazilsouth.servicebus.windows.net";
    String subscription = "subscription-" +  System.getenv("USERNAME");

    DefaultAzureCredential credential = new DefaultAzureCredentialBuilder().build();
        
    ServiceBusAdministrationClient adminClient = new ServiceBusAdministrationClientBuilder()
    .credential(serviceBus, credential).buildClient(); 
    
    {
        try {
            if (!adminClient.getSubscriptionExists(topicName, subscription)) {
                adminClient.createSubscription(topicName, subscription);
                System.out.println("Criado subscription" + subscription);
            } else {
                System.out.println("Já existe a subscription: " + subscription);
            }
        } catch (Exception e) {
            System.err.println("Erro ao criar subscription: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(serviceBus)
            .credential(credential)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            .sender()
            .topicName(topicName)
            .buildClient();
        
        senderClient.sendMessage(new ServiceBusMessage(mensagem.texto()));
        System.out.println("Enviado");
        System.out.println(mensagem);
    }

    @Override
    public void buscarMensagens(List<Mensagem> mensagens) {
        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(serviceBus)
            .credential(credential)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            .processor()
            .queueName(topicName)
            .receiveMode(ServiceBusReceiveMode.RECEIVE_AND_DELETE)
            .processMessage(context -> {
                String texto = context.getMessage().getBody().toString();
                System.out.println("Dale texto");
                System.out.println(texto);
                mensagens.add(new Mensagem("Não sei", texto));
                context.complete();
            })
            .processError(context -> {
                System.out.println("Erro: " + context.getException().getMessage());
            })
            .buildProcessorClient();

        processorClient.start();
        System.out.println("Aguardando mensagens...");
        try {
            System.in.read();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            processorClient.close();
        }
        mensagens.stream().forEach(m -> System.out.println(m));
    }
    
}
