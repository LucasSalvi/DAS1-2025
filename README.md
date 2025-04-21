# DAS1-2025

# Aula 26/02/2025 
[Livro Eng Sof Moderna - Cap 7](https://engsoftmoderna.info/cap7.html)
- Interfarce = froma de comunicação
- Componetes = parte de um sistema que pode se incrementar 
- Pacotes
- Modulos 
- Camadas
- Serviços 

# Aula 27/02/2025
Arquitetura em camadas - Separar em responsividade
MVC - Separar: View = Desenho da tela, Model = informação (dados que vão aparecer  a tela), Controller = Controlar os valores da tela.

Entidade representa um classe que armazena no banco de dados

Modelo uma outra classe que apresenta na tela.

Microsserviços = pequenas partes de um um codigo que realiza uma função em especifico 

Monolito = Repositorio unico de codigo, Uso de uma unica Tecnologia, compilado, testado, gera um unico pacote, feito o deploi como um unico sistema.

# Aula 05/03/2025
Padrão arquitetural = solução para um problema específico

MVC - separa as responsabilidades (Model(dados) - View(tela) - Control(comportamento))
Estilo arquitetura = organização do projeto

Arquitetura em camadas

Divisão de responsabilidade
Performance
Segurança
Manutenibilidade
Camada de apresentação
Requisitos próprios
Camada de lógica de negócio (aplicação)
local central para definição e atualização das regras
escalar o backend suportar as requisições
Camada de persistência
Banco de dados relacional - consolidada
Resolve problemas de concorrência
Permite compartilhamento de dados

# Aula 06/03/2025
[Who Needs an Architect?](https://martinfowler.com/ieeeSoftware/whoNeedsArchitect.pdf)
O que é arquitetura?
Qual o comportamento do arquiteto da "Matrix"?
Qual o comportamento do arquiteto ideal?

# Aula 13/03/2025
[Fundamentos da Arquitetura de Software]()
[Pensamento Arquitetônico]()

# Aula 19/03/2025
- Trade-offs
- Tópicos
- Filas
- Fan out

# Aula 03/04/2025
Filas 
Remover Acoplamento
Garantia de entrega Unica

# Aula 09/04/2025
[Características Arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2[%3Bvnd.vst.idref%3Dcover]!/4/2/2%4071:49)
Requisitos Funcionais = Funcionalidades do Sistema
Requisitos Não Funcionais = São requisitos que não são funcionalidades do sistemas

- Disponibilidade: Por quanto tempo o sistema precisa ficar disponível (se for 24/7, é preciso ter etapas para permitir que o sistema fique ativo rápido no caso de qualquer falha).
- Continuidade: Capacidade de recuperação de desastres.
- Desempenho: Inclui teste de estresse, análise de pico, análise da frequência das funções usadas, capacidade requerida e tempos de resposta. Por vezes, a aceitação do desempenho requer um exercício próprio, levando meses para concluir.
- Recuperabilidade: Requisitos de continuidade do negócio (por exemplo, no caso de desastres, com que rapidez o sistema precisa ficar online de novo?). Isso afetará a estratégia de backup e os requisitos para o hardware duplicado.
- Confiabilidade/ segurança: Avalia se o sistema precisa ser à prova de falhas ou se tem uma missão crítica no modo como afeta a vida das pessoas. Se ele falha, custará muito dinheiro para a empresa?
- Robustez: A capacidade de lidar com condições de erro e limites durante a execução, caso a conexão de internet caia ou se há falta de energia ou falha no hardware.
Escalabilidade	A capacidade de o sistema rodar e operar quando o número de usuários ou requisições aumenta.

# Aula 10/04/2025
- Configuração: A capacidade dos usuários finais de mudar com facilidade os aspectos de configuração do software (com interfaces úteis).
- Extensão: Como é importante ligar as novas partes da funcionalidade.
- Instabilidade: Facilidade de instalação do sistema em todas as plataformas necessárias.
- Aproveitamento/ reutilização: Capacidade de aproveitar os componentes comuns em vários produtos.
- Localização: Suporte para vários idiomas nas telas de entrada/consulta nos campos de dados; nos relatórios, requisitos de caracteres multibytes e unidades de medidas ou moedas.
- Manutenção: Quão facilmente aplica as alterações e melhora o sistema?
- Portabilidade: O sistema precisa rodar em mais de uma plataforma? (Por exemplo, o front-end precisa rodar no Oracle e no banco de dados SAP?)
- Suporte: De qual nível de suporte técnico a aplicação precisa? Qual nível de registro e outras facilidades são requeridos para depurar os erros no sistema?
- Atualização: A capacidade de atualizar com facilidade/rapidez uma versão prévia dessa aplicação/solução para uma versão mais nova nos servidores e nos clientes.

# Aula 16/04/2025
- Bola de Lama: Descrever uma aplicação de script simples com manipuladores de eventos ligados diretamente às chamadas de banco de dados, sem nenhuma estrutura interna real. Muitas aplicações comuns iniciam assim, então ficam desajeitados conforme continuam a crescer.
- Cliente/Servidor: Estilo arquitetural que separa a aplicação entre cliente (interface) e servidor(processamento e dados)
- Desktop + servidor de banco de dados: Modelo clássico onde a interface do usuário roda no desktop e o banco de dados em um servidor separado. 
- Navegador + servidor web: Com a web, o navegador passou a ser o cliente leve, se conectando a um servidor web que acessa o banco de dados
- Três camadas: Quando ferramentas como servidores de aplicação se tornaram populares em Java e .NET, as empresas começaram a criar ainda mais camadas na topologia: uma camada de banco de dados usando um servidor de banco de dados com capacidade industrial, uma camada de aplicação gerenciada por um servidor de aplicação, um front-end escrito em HTML gerado e cada vez mais JavaScript, conforme suas capacidades expandiam.
* Arquiteturas Monolíticas Versus Distribuídas
- Falácia 1 - A Rede É Confiável: Embora as redes tenham ficado mais confiáveis com o tempo, o fato é que elas ainda permanecem não confiáveis em geral. Isso é importante para todas as arquiteturas distribuídas porque todos os estilos distribuídos contam com a rede para se comunicar com os serviços, assim como entre os serviços.
- Falácia 2 - A Latência É Zero: Em arquiteturas distribuídas, chamadas locais são muito mais rápidas do que chamadas remotas. Muitos arquitetos ignoram essa diferença de latência, acreditando que redes rápidas resolvem tudo. No entanto, conhecer a latência média real é essencial para avaliar a viabilidade e desempenho de arquiteturas distribuídas, principalmente em microsserviços, onde há muitas chamadas entre serviços
- Falácia 3 - A Largura de Banda É Infinita: Em arquiteturas monolíticas, a largura de banda raramente é um problema, mas em arquiteturas distribuídas, a comunicação frequente entre serviços consome muita largura de banda e afeta o desempenho e a confiabilidade. Um exemplo disso é o uso de stamp coupling, quando um serviço envia muitos dados desnecessários para outro. Isso gera tráfego excessivo e pode causar sobrecarga na rede
- Falácia 4 - A Rede É Segura: A segurança fica muito mais desafiadora em uma arquitetura distribuída.A área para ameaças e ataques aumenta em magnitude ao passar de uma arquitetura monolítica para uma distribuída. Ter que assegurar cada endpoint, mesmo na comunicação entre os serviços, é outro motivo para o desempenho ser mais lento nas arquiteturas síncronas e altamente distribuídas, como os microsserviços ou a arquitetura baseada em serviços.
- Falácia 5 - A Topologia Nunca Muda: Os arquitetos devem estar em constante comunicação com os profissionais de operações e os administradores de rede para saber o que muda e quando para que possam fazer ajustes de acordo com isso para reduzir as surpresas.
- Falácia 6 - Existe Apenas Um Administrador: Essa falácia aponta para a complexidade da arquitetura distribuída e a quantidade de coordenação que deve ocorrer para tudo funcionar corretamente. As aplicações monolíticas não requerem esse nível de comunicação e colaboração devido às características unitárias da implementação desses estilos de arquitetura.
- Falácia 7 - O Custo do Transporte É Zero:  O custo do transporte aqui não se refere à latência, mas ao custo real em termos de dinheiro associado a fazer uma “simples chamada RESTful”. Os arquitetos pressupõem que a infraestrutura necessária existe e é suficiente para fazer uma simples chamada RESTful ou dividir uma aplicação monolítica. Em geral não é. As arquiteturas distribuídas custam muito mais do que as monolíticas, basicamente devido às maiores necessidades de hardware, servidores, gateways, firewalls, novas sub-redes e proxies adicionais, entre outros.
- Falácia 8 - A Rede É Homogênea: A maioria dos arquitetos e dos desenvolvedores pressupõe que uma rede é homogênea, composta apenas por um fornecedor de hardware da rede. Nada poderia estar mais distante da verdade. A maioria das empresas tem vários fornecedores de hardware da rede em sua infraestrutura, se não mais.
- Log distribuído: Realizar uma análise da causa-raiz para determinar por que certo pedido foi retirado é muito difícil e demorado em uma arquitetura distribuída devido à distribuição da aplicação e dos logs do sistema. Em uma aplicação monolítica, em geral há apenas um log, facilitando rastrear uma requisição e determinar o problema. Mas as arquiteturas distribuídas contêm de dezenas a centenas de logs diferentes, todos localizados em lugares diferentes e todos com um formato diferente, dificultando rastrear um problema.
- Transações distribuídas: Em arquiteturas monolíticas, transações são simples e gerenciadas por frameworks usando o modelo ACID, garantindo alta consistência e integridade dos dados. Já em arquiteturas distribuídas, isso não é viável, e aplica-se o conceito de consistência eventual, aceitando atrasos na sincronização dos dados em troca de escalabilidade, desempenho e disponibilidade.
- Manutenção e versionamento de contrato: Outro desafio particularmente difícil na arquitetura distribuída é a criação, manutenção e versionamento do contrato. Contrato é o comportamento e os dados acordados pelo cliente e pelo servidor. A manutenção do contrato é bem difícil nas arquiteturas distribuídas, basicamente devido aos serviços desacoplados e aos sistemas possuídos por diferentes equipes e departamentos. Ainda mais complexos são os modelos de comunicação necessários para a descontinuidade da versão.