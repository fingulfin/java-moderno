import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;

public class MainHttp2 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        //Main http
        var cliente= HttpClient.newBuilder().build();
        var uri=new URI("https://google.com");
        var httpRequest= HttpRequest.newBuilder(uri).build();
        var response=cliente.send(
                httpRequest,
                HttpResponse.BodyHandlers.ofString(Charset.defaultCharset())
        );
        System.out.println(response);
    }
}
