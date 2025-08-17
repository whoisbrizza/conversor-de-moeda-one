import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        try {
            //URL exchangerate-api
            String url_str = "https://v6.exchangerate-api.com/v6/80738f847aa9722abd8e1715/latest/USD";
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod("GET");
            request.connect();

            //utilizando gson e passando para objeto json com base em exemplos
            InputStream inputStream = request.getInputStream();
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader(inputStream));
            JsonObject jsonobj = root.getAsJsonObject();
            JsonObject conversion_rates = jsonobj.getAsJsonObject("conversion_rates");

            //Fechando recursos
            inputStream.close();
            request.disconnect();

            //Loop Menu com base no exemplo alura
            do {
                System.out.println("****************************************************************************************************");
                System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
                System.out.println();
                System.out.println("1) Dólar Americano (USD) ==> Real Brasileiro (BRL)");
                System.out.println("2) Real Brasileiro (BRL) ==> Dólar Americano (USD)");
                System.out.println("3) Dólar Americano (USD) ==> Euro (EUR)");
                System.out.println("4) Euro (EUR) ==> Dólar Americano (USD)");
                System.out.println("5) Dólar Americano (USD) ==> Iene Japonês (JPY)");
                System.out.println("6) Iene Japonês (JPY) ==> Dólar Americano (USD)");
                System.out.println("7) Dólar Americano (USD) ==> Libra Esterlina (GBP)");
                System.out.println("8) Libra Esterlina (GBP) ==> Dólar Americano (USD)");
                System.out.println("9) Sair");
                System.out.print("Escolha uma opção válida: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                String moedaOrigem = "";
                String moedaDestino = "";

                switch (opcao) {
                    case 1:
                        moedaOrigem = "USD";
                        moedaDestino = "BRL";
                        break;
                    case 2:
                        moedaOrigem = "BRL";
                        moedaDestino = "USD";
                        break;
                    case 3:
                        moedaOrigem = "USD";
                        moedaDestino = "EUR";
                        break;
                    case 4:
                        moedaOrigem = "EUR";
                        moedaDestino = "USD";
                        break;
                    case 5:
                        moedaOrigem = "USD";
                        moedaDestino = "JPY";
                        break;
                    case 6:
                        moedaOrigem = "JPY";
                        moedaDestino = "USD";
                        break;
                    case 7:
                        moedaOrigem = "USD";
                        moedaDestino = "GBP";
                        break;
                    case 8:
                        moedaOrigem = "GBP";
                        moedaDestino = "USD";
                        break;
                    case 9:
                        System.out.println("Programa encerado.");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        continue; //Reinicia o loop de pergunta
                }

                if (opcao != 9) {
                    System.out.print("Digite o valor a converter: ");
                    BigDecimal valor = scanner.nextBigDecimal();

                    //salvar valores como BigDecimal para maior precisao
                    BigDecimal taxaOrigem = conversion_rates.get(moedaOrigem).getAsBigDecimal();
                    BigDecimal taxaDestino = conversion_rates.get(moedaDestino).getAsBigDecimal();

                    //Calculo da conversão
                    BigDecimal valorConvertido = valor.divide(taxaOrigem, 10, RoundingMode.HALF_UP).multiply(taxaDestino);

                    System.out.printf("Valor convertido de %s %.2f para %s: %.2f%n%n", moedaOrigem, valor, moedaDestino, valorConvertido);
                }

            } while (opcao != 9);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
        } finally {
            scanner.close();
            System.out.println("****************************************************************************************************");
        }
    }
}