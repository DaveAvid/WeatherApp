import services.WeatherHandler;

import java.io.IOException;
public class MainApplication {

    public static void main(String[] args) throws IOException {
        WeatherHandler weatherHandler = new WeatherHandler();
        weatherHandler.weatherConnection("Seattle,WA");
    }

}

