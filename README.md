# Conversor de Moeda via Console/Terminal - Desafio Alura

Este projeto é uma solução para o "Challenge Conversor de Moeda", proposto pela Alura. Trata-se de uma aplicação de console desenvolvida em Java que permite a conversão de valores entre diferentes moedas, utilizando uma API de taxas de câmbio em tempo real.

## Funcionalidades

O programa apresenta um menu interativo com as seguintes opções de conversão, baseadas nas taxas de câmbio do Dólar Americano (USD):

1.  Dólar Americano (USD) ==> Real Brasileiro (BRL)
2.  Real Brasileiro (BRL) ==> Dólar Americano (USD)
3.  Dólar Americano (USD) ==> Euro (EUR)
4.  Euro (EUR) ==> Dólar Americano (USD)
5.  Dólar Americano (USD) ==> Iene Japonês (JPY)
6.  Iene Japonês (JPY) ==> Dólar Americano (USD)
7.  Dólar Americano (USD) ==> Libra Esterlina (GBP)
8.  Libra Esterlina (GBP) ==> Dólar Americano (USD)
9.  Sair

A aplicação utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de conversão de forma dinâmica e precisa.

## Como Rodar o Projeto

### Pré-requisitos

Certifique-se de que o **Java Development Kit (JDK)** está instalado em sua máquina. Para verificar a instalação, abra o terminal e digite:

```bash
java -version
```
Faça o clone deste repositório para sua máquina local.

Abra o PowerShell no diretório do projeto.

Execute o arquivo run.bat para compilar e rodar a aplicação:
```bash
.\run.bat
```

Tecnologias Utilizadas
Java 17+: Linguagem de programação.
Gson: Biblioteca para manipulação de JSON.
ExchangeRate-API: API de taxas de câmbio.
