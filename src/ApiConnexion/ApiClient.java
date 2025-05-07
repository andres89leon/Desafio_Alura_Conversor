package ApiConnexion;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    public static String getJsonFromApi() throws Exception {
        String urlDeSolicitud = "https://v6.exchangerate-api.com/v6/3954a0d6a05aca7f73bf63de/latest/USD";
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlDeSolicitud))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
}
