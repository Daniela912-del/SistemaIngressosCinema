# Sistema de Ingressos para Cinema

Sistema de venda de ingressos para cinema desenvolvido em Java utilizando Programação Orientada a Objetos (POO).

## Sobre o Projeto

O sistema permite a venda de diferentes tipos de ingressos para o filme **Vingadores**, aplicando regras de negócio específicas para cada modalidade.

A aplicação foi desenvolvida com foco nos conceitos de:

- Herança
- Polimorfismo
- Encapsulamento
- Construtores
- Sobrescrita de métodos (@Override)
- JOptionPane
- Formatação de valores monetários

## Funcionalidades

- Compra de ingresso normal
- Compra de meia-entrada
- Compra de ingresso família
- Cálculo automático de descontos
- Seleção de idioma (Dublado ou Legendado)
- Menu interativo utilizando JOptionPane
- Exibição dos valores formatados em Real (R$)

## Regras de Negócio

### Ingresso Normal

- Valor fixo: R$ 30,00

### Meia Entrada

- 50% de desconto sobre o valor do ingresso
- Valor final: R$ 15,00

### Ingresso Família

- Valor calculado pela quantidade de pessoas
- Desconto de 5% para grupos com mais de 3 pessoas

## Exemplo de Cálculo

Valor do ingresso:

R$ 30,00

Família com 4 pessoas:

- Valor sem desconto: R$ 120,00
- Desconto: R$ 6,00
- Valor final: R$ 114,00

## Estrutura do Projeto

```text
CinemaIngressos
│
├── src
│   ├── Ingresso.java
│   ├── MeiaEntrada.java
│   ├── IngressoFamilia.java
│   └── Main.java
│
├── README.md
└── .gitignore
```

## Tecnologias Utilizadas

- Java
- Swing (JOptionPane)
- IntelliJ IDEA
- Git
- GitHub

## Autor

Daniela

Projeto desenvolvido para praticar os conceitos de Programação Orientada a Objetos em Java.
