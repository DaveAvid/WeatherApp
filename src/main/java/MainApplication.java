import Models.WeatherHandler;

import java.io.IOException;


public class MainApplication {

    public static void main(String[] args) throws IOException {
        WeatherHandler weatherHandler = new WeatherHandler();
        weatherHandler.weatherConnection("Seattle,WA");
//        String key = "bc8fcd2f89d248fb93c162946202810";
//        String forecastUrl = "http://api.weatherapi.com/v1/forecast.json?key=bc8fcd2f89d248fb93c162946202810&q=Rochester,MN&days=7";
//        String currentUrl = "http://api.weatherapi.com/v1/forecast.json?key=bc8fcd2f89d248fb93c162946202810&q=Rochester&days=7";
//        HttpClient httpClient = HttpClientBuilder.create().build();
//        HttpPost request = new HttpPost(forecastUrl);
//        String basicAuth = "Basic"  + new String(Base64.encode(key.getBytes()));
//        request.addHeader("Authorization", basicAuth);
//        request.addHeader("Content-Type", "current/json");
//        HttpResponse response = httpClient.execute(request);
//        System.out.println(readJsonFromUrl(currentUrl));
//        Scanner sc = new Scanner(response.getEntity().getContent());


    }

}

