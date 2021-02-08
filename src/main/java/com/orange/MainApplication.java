package com.orange.weather;

import com.orange.weather.services.WeatherService;

import java.io.IOException;
public class MainApplication {

    public static void main(String[] args) throws IOException {
        WeatherService weatherService = new WeatherService();
        weatherService.weatherConnection("Minneapolis");
    }

}

