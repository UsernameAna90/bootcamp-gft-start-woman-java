package introducaohttp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class GetRequest {

    //public static final String URL_GET = "https://jsonplaceholder.typicode.com/posts";
    public static final String URL_GET = "http://httpbin.org/get";

    public static void main(String[] args) throws IOException, InterruptedException {

        //Criando cliente http
        HttpClient cliente = HttpClient.newHttpClient();

        //Criando a requisicao
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_GET))
                .build(); //Metodos

        //Enviando uma solicitação
        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        //Imprimindo o conteudo requisitado
        System.out.println(response.statusCode()); //Imprime o status de sucesso
        System.out.println(response.body()); //Imprime o corpo da mensagem
    }
}
