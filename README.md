
# Spring Boot - Desafio: Componentes e Injeção de Dependência

Este repositório contém uma aplicação desenvolvida como parte de um desafio proposto no curso "Java Spring Professional" da DevSuperior. O objetivo do projeto é praticar a criação de componentes e a injeção de dependência utilizando o framework Spring Boot.

A aplicação consiste em um sistema que realiza o cálculo do valor total de um pedido. Este cálculo considera:

- Porcentagem de desconto sobre o valor básico do pedido.
- O valor do frete, determinado com base em regras específicas.
    
## Regras de Negócio
### Frete:
- Pedidos com valor básico abaixo de R$ 100,00: frete de R$ 20,00
- Pedidos com valor básico entre R$ 100,00 e R$ 200,00 (exclusive): frete de R$ 12,00
- Pedidos com valor básico de R$ 200,00 ou mais: frete gratuito.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Maven

## Estrutura do projeto

A aplicação é composta por dois principais serviços:

 1. OrderService
Responsável pelas operações relacionadas aos pedidos, como:
- Aplicar o desconto
- Adicionar o valor do frete
- Calcular o valor total do pedido
2. ShippingService
Determina o valor do frete com base no valor básico do pedido, conforme as regras de Negócio

## Como Executar o projeto
### Pré-requisitos
- Java JDK 17 ou superior instalado
- Maven instalado
- IDE da sua preferência
### Passo a Passo

```bash
# 1. Clone o repositório:
git@github.com:HandersonBarreto/Spring_desafio_componentes_injecao_dependencia.git

# 2. Navegue até a pasta do projeto:
cd Spring_desafio_componentes_injecao_dependencia

#3. Execute o projeto com o Maven:
mvn spring-boot:run
```
# Funcionamento
O sistema é configurado para funcionar com valores fixos de desconto e frete. Para testar o funcionamento, basta executar a aplicação, que utiliza exemplos simulados como entrada.

Exemplo de um pedido:
```java
Order order = new Order(1309, 95.90, 0.0);
```
# Aprendizados
- Criação de componentes Spring.
- Configuração e utilização de injeção de dependências.
- Aplicação de boas práticas de design de software.

# Contribuição
Contribuições são bem-vindas! Caso encontre algum problema ou queira sugerir melhorias, abra uma issue ou envie um pull request.

# Autor
### Handerson Aires Barreto Ferreira
www.linkedin.com/in/handerson-barreto
