package introducaohttp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class PostRequest {

    public static final String URL_POST = "http://httpbin.org/forms/post";
    public static final String FILE_JSON = "http://httpbin.org/post";

    public static void main(String[] args) throws IOException, InterruptedException {

        //Criando cliente http
        HttpClient cliente = HttpClient.newHttpClient();

        //Criando a requisicao
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(FILE_JSON)) //Retorna erro: Method Not Allowed
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build(); //Metodos

        //Enviando solicitacao
        cliente.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

        //Retorna que o método não é permitido
    }
}
