# DAS1-2025

# Aula 26/02/2025 
[Livro Eng Sof Moderna - Cap 7](https://engsoftmoderna.info/cap7.html)
- Interfarce = Froma de comunicação
- Componetes = parte de um sistema que pode se incrementar 
- Pacotes = Agrupamentos lógicos de classes ou módulos
- Modulos = Unidades de software que encapsulam uma funcionalidade específica
- Camadas = Representam uma organização hierárquica do sistema
- Serviços = Funcionalidades específicas e podem ser acessados por outros componentes ou sistemas

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
É a parte do sistema aonde é escolhida quais frameworks, tecnologias, padrões que o sistema ira utilizar e a capacidade do sistema de atender aos requisitos funcionais e não funcionais.
Qual o comportamento do arquiteto da "Matrix"?
É quem realiza as decisões do sistema e controla o projeto sem se eenvolver com os desenvolvedores do sistem, porem acaba limitando a colaboração, criativade e autonomia da equipe.
Qual o comportamento do arquiteto ideal?
O arquiteto ideal é um facilitado, que trabalha em colaboração com a equipe de desenvolvimento. Ele define diretrizes e padrões, mas tambem gosta de receber as opiniões da equipe. Foca em capacitar a equipe para que todos entendam o os objetivos arquiteturais do proejto.
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

# Aula 15/05/2025
- [Arquitetura Microkernel](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/44%5B%3Bvnd.vst.idref%3Dcap12.xhtml%5D!/4)

# Aula 28/05/2025
[Arquitetura baseada em Serviços](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/46%5B%3Bvnd.vst.idref%3Dcap13.xhtml%5D!/4)
- A arquitetura baseada em serviços é organizada em camadas: tem uma parte para o usuário (interface), várias partes chamadas serviços que funcionam separadamente, e um banco de dados grande que todos os serviços usam junto. Cada serviço é uma parte menor e independente da aplicação, e normalmente são implantados como programas comuns, sem precisar de contêineres (como Docker), embora isso seja possível. Normalmente, uma aplicação tem entre 4 e 12 desses serviços, com uma média de 7, e todos eles compartilham o mesmo banco de dados.
- A arquitetura baseada em serviços pode variar bastante, o que a torna muito flexível. Por exemplo, a interface do usuário (IU) que antes era toda junta pode ser dividida em partes menores, cada uma ligada a um serviço diferente. Também é possível separar o banco de dados grande em vários bancos de dados menores, cada um usado por um serviço específico — parecido com o que acontece em microsserviços. Mas, para isso funcionar bem, cada banco de dados deve ser usado só por um serviço, para evitar que eles precisem trocar muitos dados entre si, o que é ruim nessa arquitetura. Outra ideia é colocar uma camada extra chamada API, que age como um “meio de campo” entre a interface e os serviços, ajudando a organizar funções como segurança, métricas e auditoria, e facilitando quando outros sistemas querem usar esses serviços.
- Os serviços do domínio em uma arquitetura baseada em serviços são partes maiores e organizadas internamente em camadas: uma camada que mostra a API para a interface do usuário, uma camada que cuida das regras de negócio, e uma camada que acessa o banco de dados. Outra forma de organizar esses serviços é dividir o serviço em subpartes menores, parecido com uma aplicação monolítica modular.
Cada serviço tem uma “fachada” que recebe pedidos da interface do usuário e organiza o que precisa ser feito dentro do serviço. Por exemplo, se um cliente faz um pedido, essa fachada vai cuidar de criar o pedido, processar o pagamento e atualizar o estoque, tudo dentro do mesmo serviço.
A vantagem da arquitetura baseada em serviços é garantir a integridade dos dados, mas a desvantagem é que mudanças em um serviço grande podem afetar muitas partes dele e precisam de mais testes. Já nos microsserviços, como cada serviço é pequeno e separado, as mudanças afetam só uma parte, com menos risco de quebrar outras funções.
- Em uma arquitetura baseada em serviços, os serviços geralmente usam juntos um banco de dados grande, porque o número de serviços costuma ser pequeno (entre 4 e 12). Mas isso pode causar problemas quando alguém precisa mudar as tabelas do banco de dados, porque uma mudança pode afetar todos os serviços, o que torna o trabalho complicado e caro.
Para ajudar, os serviços usam um conjunto de arquivos compartilhados (uma biblioteca) que tem as definições das tabelas, chamadas de objetos de entidade. Essa biblioteca é usada por todos os serviços e pode ter até código SQL. Porém, essa forma de compartilhar faz com que qualquer mudança no banco exija que todos os serviços atualizem essa biblioteca, mesmo que alguns serviços nem usem a tabela que mudou. Isso dificulta saber quais serviços serão afetados e aumenta o esforço para fazer mudanças.
Além disso, algumas tabelas são usadas por todos os serviços (domínio comum), e mudar essas tabelas precisa de muita coordenação. Para evitar problemas, essas tabelas e seus objetos são bloqueados para que só a equipe de banco de dados possa mexer, assim controlando melhor as mudanças importantes.
- Na arquitetura baseada em serviços, o sistema é dividido por domínios, ou seja, cada serviço representa uma parte específica do negócio, como a avaliação de um item em um sistema de reciclagem. Quando algo muda em um domínio, só o serviço relacionado, a interface do usuário e o banco de dados desse domínio precisam ser alterados.
Mesmo com vários serviços, se eles compartilham o mesmo banco de dados e interface, o sistema funciona como uma única parte (quantum). Mas se a interface e o banco forem separados, pode haver mais de um quantum no sistema.
Essa arquitetura não tem nota máxima em nenhuma característica, mas é muito boa em agilidade (mudanças rápidas), testabilidade (testar melhor cada parte) e implementabilidade (implantar mudanças com menos risco). Isso ajuda a lançar atualizações e corrigir problemas mais rápido.
Também é confiável e disponível, porque os serviços são independentes e, se um parar de funcionar, os outros continuam trabalhando normalmente.
Por outro lado, a escalabilidade (capacidade de crescer) e elasticidade (ajustar recursos conforme a demanda) são médias, porque os serviços são maiores e replicar muitos recursos pode ser menos eficiente que arquiteturas com serviços menores, como microsserviços.
A arquitetura baseada em serviços é mais simples e barata de implementar comparada a arquiteturas mais complexas, mas isso significa que algumas características não são tão fortes quanto em arquiteturas mais caras e complexas.
Por fim, ela tende a ser mais confiável que outras arquiteturas distribuídas, porque tem menos tráfego entre serviços e menos transações distribuídas, o que diminui problemas na rede.

[Arquitetura baseada em Microsserviços]([https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/46%5B%3Bvnd.vst.idref%3Dcap13.xhtml%5D!/4](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/54[%3Bvnd.vst.idref%3Dcap17.xhtml]!/4/2/218/2%4050:33))
- Os microsserviços são uma forma de arquitetura onde cada serviço funciona de forma independente, cada um em seu próprio processo. Antes, isso significava usar computadores físicos, mas hoje em dia usamos máquinas virtuais e contêineres, que facilitam muito o gerenciamento. Essa separação ajuda a evitar problemas de recursos compartilhados, tipo memória ou rede, e melhora o isolamento entre as aplicações.
Com a evolução dos sistemas operacionais abertos e a nuvem, ficou mais fácil cada serviço ter sua própria infraestrutura, o que traz muitos benefícios. Porém, a desvantagem dos microsserviços é que, por serem distribuídos, a comunicação entre eles pela rede é mais lenta do que chamadas dentro do mesmo sistema, e ainda tem a questão da segurança, que aumenta o tempo de processamento.
Por isso, quem cria sistemas com microsserviços precisa pensar muito bem em como dividir os serviços, porque usar transações que envolvem vários serviços pode complicar tudo. A chave do sucesso é escolher bem o tamanho e a função de cada serviço para o sistema funcionar direito.
- Finalidade: Cada serviço deve ter uma função bem clara e coesa, contribuindo para o sistema como um todo.
- Transações: Serviços que precisam fazer transações juntos geralmente indicam um limite natural. Evitar transações entre serviços pode ajudar a criar um design melhor.
- Coreografia: Se os serviços precisam se comunicar demais, talvez valha a pena juntar alguns para diminuir essa sobrecarga.
- Um ponto importante dos microsserviços é que cada serviço deve ter seu próprio banco de dados, sem compartilhar com outros serviços. Isso ajuda a evitar que os serviços fiquem muito ligados entre si, o que dificultaria mudanças e manutenção.
Os arquitetos precisam tomar cuidado para não só copiar as entidades do banco de dados em seus serviços — eles têm que pensar no isolamento real dos dados. Antes, usavam um banco de dados único para manter tudo organizado, mas isso não funciona bem com microsserviços, que são distribuídos.
Então, eles têm que escolher como vão garantir a confiabilidade dos dados: seja deixando um serviço como responsável pela informação, usando replicação de dados, ou cache para compartilhar informações entre serviços.
Apesar de ser complicado manter os dados isolados, isso traz vantagens. Cada equipe pode escolher o banco de dados que achar melhor para seu serviço, sem precisar seguir o mesmo padrão dos outros. Isso deixa o sistema mais flexível e facilita mudar as tecnologias sem atrapalhar o resto.
- Na arquitetura de microsserviços, geralmente tem uma camada de API entre os usuários (ou outros sistemas) e os serviços, mas ela é opcional. Essa camada ajuda a fazer algumas tarefas, tipo funcionar como um proxy ou ajudar em serviços de nomeação, facilitando a operação.
Mas essa camada de API não deve virar um mediador que controla a lógica ou faz a orquestração dos serviços. Isso porque, na filosofia dos microsserviços, toda a lógica importante deve estar dentro de cada serviço, no seu próprio domínio. Se a gente colocar essa lógica num mediador, quebra essa ideia.
Essa diferença mostra que, enquanto outras arquiteturas separam o sistema por questões técnicas e usam mediadores, os microsserviços são organizados por domínio, com a lógica dentro de cada serviço.
- Nos microsserviços, é importante escolher o tamanho certo dos serviços, o que influencia como os dados ficam isolados e como eles se comunicam. A comunicação pode ser síncrona (quem pede espera a resposta) ou assíncrona (a resposta pode vir depois, sem travar o pedido).
- Heterogênea porque os serviços podem usar tecnologias diferentes
- Interoperabilidade porque eles se comunicam pela rede para trocar informações.
- A arquitetura de microsserviços tem pontos fortes e fracos bem marcados. Ela é ótima para práticas modernas de engenharia, como automação e testes, que só foram possíveis graças ao DevOps. Por ser distribuída, enfrenta problemas comuns dessas arquiteturas, tipo falhas e confiabilidade, principalmente quando tem muita comunicação entre os serviços. Mas, em geral, como os serviços são independentes e com propósitos claros, a tolerância a falhas costuma ser alta.
Os grandes destaques são a escalabilidade, elasticidade (capacidade de se ajustar rápido) e evolução rápida. Muitos sistemas muito escaláveis usam microsserviços com sucesso. Como eles são muito desacoplados e pequenos, facilitam mudanças rápidas no software, que é essencial no mundo dos negócios hoje.
Um problema frequente é a performance, porque chamadas pela rede são mais lentas e tem a questão da segurança que exige mais tempo. Para melhorar isso, usam estratégias como cache e replicação de dados, e preferem a coreografia (serviços se comunicando de forma independente) em vez de orquestração (controle central), pois isso deixa tudo mais rápido e menos travado.
No geral, os microsserviços são centrados no domínio do negócio, cada serviço cobre um domínio específico, e a ideia principal é desacoplar ao máximo. Isso pode dar trabalho, mas traz muitos benefícios quando feito do jeito certo. E, claro, arquitetos devem conhecer as regras para saber quando e como quebrá-las sem estragar o sistema.

# Aula 29/05/2025
- [Arquitetura baseada em Serviços](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/46%5B%3Bvnd.vst.idref%3Dcap13.xhtml%5D!/4)
- Na arquitetura baseada em serviços tradicional, a estrutura é em camadas: tem uma interface de usuário separada, vários serviços remotos também separados, e um banco de dados único e monolítico que todos usam.
Esses serviços são partes da aplicação, chamados de serviços do domínio, que funcionam de forma independente e são implantados separadamente, mas geralmente como aplicações monolíticas — tipo arquivos EAR, WAR ou similares. Normalmente, não precisam usar contêineres, mas dá pra usar, por exemplo, Docker, se quiser.
Como todos os serviços compartilham o mesmo banco de dados monolítico, normalmente uma aplicação tem entre 4 e 12 serviços, sendo que a média é uns 7 serviços por aplicação.
- A arquitetura baseada em serviços é bem flexível e tem várias formas de funcionar. Por exemplo, a interface do usuário (IU) que era toda junto pode ser dividida em partes que correspondem a cada serviço do domínio, deixando a IU mais modular.
Também dá para dividir o banco de dados monolítico em vários bancos menores, cada um ligado a um serviço do domínio, parecido com o que acontece nos microsserviços. Mas é importante que os dados de um banco não precisem ser usados por outro serviço, para evitar comunicação interna entre serviços e duplicação de dados, que são coisas que a arquitetura baseada em serviços tenta evitar.
Outra coisa que pode ser feita é colocar uma camada de API entre a IU e os serviços, que funciona como um proxy ou gateway reverso. Isso ajuda a expor os serviços para sistemas externos e a tirar tarefas comuns da IU, tipo segurança, métricas e auditoria.
- Na arquitetura baseada em serviços, os serviços do domínio são granulares e geralmente seguem um design em camadas, com uma camada de fachada da API, uma camada comercial e outra de persistência. Outra forma de organizar é dividir o serviço em subdomínios, parecido com arquitetura monolítica modular.
Cada serviço tem uma fachada de API que a interface do usuário usa para pedir uma função, como “fazer um pedido”. Essa fachada orquestra tudo internamente, tipo gerar ID do pedido, processar pagamento e atualizar estoque. Isso é diferente dos microsserviços, onde muitas funções pequenas e separadas precisam se comunicar para completar essa tarefa — a orquestração acontece entre vários serviços externos.
Na arquitetura baseada em serviços, as transações no banco são ACID, ou seja, garantem integridade total. Já nos microsserviços, usam transações BASE, que aceitam uma consistência eventual.
Por exemplo: se um cliente tentar pagar com cartão expirado numa arquitetura baseada em serviços, o sistema faz rollback e cancela tudo, avisando o cliente. Nos microsserviços, como o pedido e o pagamento são separados, pode ficar um pedido registrado sem pagamento, o que gera problema de inconsistência, como o estoque ficar marcado errado.
O lado bom dos serviços maiores na arquitetura baseada em serviços é que a integridade dos dados é melhor, mas uma mudança pode impactar várias funcionalidades, exigindo mais testes. Nos microsserviços, como os serviços são menores e focados, uma mudança afeta menos partes e tem menos risco de quebrar algo.
- Arquitetura pragmática:Essa arquitetura é flexível e tem muitas características boas (3 ou 4 estrelas), o que a torna uma escolha prática para muitas empresas.Nem todo mundo precisa da “potência máxima” de arquiteturas mais complexas, tipo microsserviços supergranulares, que são como usar uma Ferrari só pra ir devagar no trânsito — legal, mas caro e desnecessário.
- Design orientado a domínio: Como os serviços são organizados por domínio, cada serviço cuida de uma parte específica do negócio, facilitando a manutenção e a evolução daquela funcionalidade.
- Transações com ACID melhor preservadas: Mesmo sendo distribuída, essa arquitetura consegue manter melhor as transações tradicionais do que outras arquiteturas que usam consistência eventual.Quando uma transação envolve vários serviços, aí sim entram as sagas e transações BASE, mas isso não é o mais comum.
- Modularidade sem muita complexidade:A arquitetura consegue ser modular, mas evita a complexidade de ter serviços muito pequenos, que exigem muita coordenação.
- Coordenação dos serviços:Orquestração: um serviço central que controla o fluxo das ações entre vários serviços. Coreografia: cada serviço conversa direto com outro, sem um controlador central.Quanto menores e mais granulares os serviços, mais precisa dessa coordenação. Na arquitetura baseada em serviços, os serviços são maiores, então essa coordenação é menos necessária.
- [Arquitetura baseada em Microsserviços](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/54%5B%3Bvnd.vst.idref%3Dcap17.xhtml%5D!/4)
- A ideia dos microsserviços vem muito do DDD (Domain-Driven Design), que é uma forma de organizar o desenvolvimento do software. Um conceito importante do DDD é o contexto delimitado, que quer dizer que cada parte do sistema cuida só da sua função e não se mistura com as outras.
- A arquitetura de microsserviços é distribuída, cada serviço funciona separadamente, rodando no seu próprio processo.Separar os serviços ajuda a evitar problemas de compartilhamento de recursos entre várias aplicações. Mas com cada serviço separado, esses problemas diminuem bastante.Por outro lado, essa separação pode causar problemas de desempenho, porque a comunicação pela rede é mais lenta que dentro de um programa só. Além disso, cada serviço precisa verificar a segurança, o que também pode deixar tudo mais lento.
- Na arquitetura de microsserviços, é importante escolher o tamanho certo dos serviços. Muitos desenvolvedores acabam deixando os serviços pequenos demais, o que obriga eles a se comunicarem muito entre si e isso pode deixar o sistema mais lento e difícil de manter.
- Finalidade: Cada serviço deve fazer algo útil e bem definido dentro do sistema.
- Transações: Se várias partes precisam trabalhar juntas numa transação, talvez elas devam estar no mesmo serviço, para evitar problemas de comunicação.
- Coreografia: Se os serviços precisam conversar demais para funcionar, pode ser melhor juntá-los para reduzir o excesso de comunicação.
- Um ponto importante na arquitetura de microsserviços é o isolamento dos dados. Diferente de outros estilos, onde vários serviços usam o mesmo banco de dados, os microsserviços evitam esse tipo de compartilhamento, porque isso causa acoplamento. Cada serviço deve ter seu próprio banco de dados ou esquema, sem dividir com os outros. Isso ajuda a manter tudo mais separado e organizado, mas também traz desafios. Por exemplo, não dá mais pra usar um banco de dados único como “fonte confiável” de tudo, então o arquiteto precisa pensar em novas formas de trocar ou espalhar informações entre os serviços, como usando replicação, cache ou definindo qual serviço é responsável por cada informação. Apesar de dar mais trabalho, isso também traz vantagens. Como cada serviço cuida dos próprios dados, ele pode escolher o tipo de banco de dados que quiser, conforme a necessidade, preço ou desempenho.
- Os microsserviços não usam um sistema central para conectar tudo, então cada serviço precisa saber como chamar os outros. Por isso, os arquitetos escolhem protocolos padronizados, como REST ou filas de mensagens. Isso se chama protocolo reconhecido. A arquitetura de microsserviços também é heterogênea, ou seja, cada serviço pode usar uma tecnologia diferente. Isso permite mais liberdade e flexibilidade, e evita que equipes fiquem dependentes umas das outras.Um exemplo legal foi de um arquiteto que obrigou cada equipe a usar uma tecnologia diferente. Isso fazia com que elas não compartilhassem código sem querer, mantendo tudo bem separado. Embora vá contra o que muitas empresas fazem (que preferem padronizar tudo), nos microsserviços a ideia é escolher a melhor tecnologia para cada parte do sistema, e não forçar todas as equipes a usarem a mesma coisa.
- A arquitetura de microsserviços tem várias características fortes e fracas, dependendo do que se analisa. Em geral, ela funciona muito bem com práticas modernas de desenvolvimento, como automação, testes e DevOps. Sem essas práticas, os microsserviços nem existiriam.
- Como essa arquitetura é distribuída, ela pode ter problemas de desempenho e confiabilidade, já que os serviços se comunicam muito pela rede e precisam checar segurança o tempo todo. Porém, os desenvolvedores usam estratégias, como cache, replicação e descoberta de serviços, para melhorar esses pontos.
- Escalabilidade: crescem fácil quando a demanda aumenta.
- Elasticidade: se adaptam bem a mudanças de uso.
- Evolução rápida: como os serviços são pequenos e separados, fica mais fácil atualizar o sistema com frequência, o que ajuda as empresas a acompanharem mudanças do mercado.
- Os microsserviços também são muito focados no domínio, cada serviço deve representar uma parte real do negócio. Isso ajuda a organizar melhor o sistema e faz com que ele seja mais claro e flexível.
