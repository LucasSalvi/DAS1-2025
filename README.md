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
Características Estruturais


