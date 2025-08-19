# Conversor de Moeda via Console/Terminal - Desafio Alura

Este projeto é uma solução para o "Challenge Conversor de Moeda", proposto pela Alura. Trata-se de uma aplicação de console desenvolvida com **Spring Boot** que permite a conversão de valores entre diferentes moedas, utilizando uma API de taxas de câmbio em tempo real.

## Funcionalidades

O programa apresenta um menu interativo com as seguintes opções de conversão, baseadas nas taxas de câmbio do Dólar Americano (USD):

1. Dólar Americano (USD) ==> Real Brasileiro (BRL)
2. Real Brasileiro (BRL) ==> Dólar Americano (USD)
3. Dólar Americano (USD) ==> Euro (EUR)
4. Euro (EUR) ==> Dólar Americano (USD)
5. Dólar Americano (USD) ==> Iene Japonês (JPY)
6. Iene Japonês (JPY) ==> Dólar Americano (USD)
7. Dólar Americano (USD) ==> Libra Esterlina (GBP)
8. Libra Esterlina (GBP) ==> Dólar Americano (USD)
9. Sair

A aplicação utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de conversão de forma dinâmica e precisa.

## Como Rodar o Projeto

### Pré-requisitos

Certifique-se de que os seguintes itens estão instalados em sua máquina:
- **Java Development Kit (JDK)** 17 ou superior. Para verificar, abra o terminal e digite:
  ```bash
  java -version
  ```

- **Maven** (para gerenciar dependências e construir o projeto). Para verificar, digite:
  ```bash
  mvn -version
  ```

### Passos para Executar

1. Faça o clone deste repositório para sua máquina local:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd <NOME_DO_DIRETORIO>
   ```
3. Compile e execute a aplicação utilizando o Maven:
   ```bash
   mvn spring-boot:run
   ```
4. Siga as instruções no console para interagir com o menu de conversão de moedas.

### Configuração Adicional

**Atenção!** Para que a aplicação funcione corretamente, você deve configurar a chave da API da ExchangeRate-API.

1. Obtenha sua chave gratuita em [ExchangeRate-API](https://www.exchangerate-api.com/).
2. Adicione a chave como uma variável de ambiente ou configure-a diretamente no arquivo `application.properties`.

#### Configurando com Variáveis de Ambiente (Recomendado)

* **Linux/macOS:**  
  Abra o seu terminal e execute o comando:

  ```bash
  export EXCHANGERATE_API_KEY=SUA_CHAVE_AQUI
  ```

  (Para que a variável seja permanente, adicione-a ao seu arquivo `.bashrc`, `.zshrc` ou similar).

* **Windows (CMD):**  
  Abra o prompt de comando e execute:

  ```bash
  set EXCHANGERATE_API_KEY=SUA_CHAVE_AQUI
  ```

* **No projeto:**  
  No arquivo `src/main/resources/application.properties`, adicione a seguinte linha:

  ```properties
  exchangerate.api.key=${EXCHANGERATE_API_KEY}
  ```

#### Configurando Diretamente no `application.properties`

Se preferir, você pode colocar a chave diretamente no arquivo `application.properties`, substituindo `SUA_CHAVE_AQUI` pela sua chave:

```properties
exchangerate.api.key=SUA_CHAVE_AQUI
```
