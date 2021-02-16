package com.orange.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.orange.models.*;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherService {


    public void weatherConnection(String cityState) throws IOException {
        JSONObject json = new JSONObject();
        ObjectMapper objectMapper = new ObjectMapper();
        String key = "bc8fcd2f89d248fb93c162946202810";
        String forecastUrl = "http://api.weatherapi.com/v1/forecast.json?key=bc8fcd2f89d248fb93c162946202810&q=Rochester,MN&days=7";
        String currentUrl = "http://api.weatherapi.com/v1/forecast.json?key=bc8fcd2f89d248fb93c162946202810&q=" + cityState + "&days=7";
        json = readJsonFromUrl(currentUrl);
        Astro astro = objectMapper.readValue(json.optString("astro"), Astro.class);
        Condition condition = objectMapper.readValue(json.optString("condition"), Condition.class);
        Condition_ condition_ = objectMapper.readValue(json.optString("condition_"), Condition_.class);
        Condition__ condition__ = objectMapper.readValue(json.optString("condition__"), Condition__.class);
        Current current = objectMapper.readValue(json.optString("current"), Current.class);
        Day day = objectMapper.readValue(json.getString("day"), Day.class);
        Forecast forecast = objectMapper.readValue(json.optString("forecast"), Forecast.class);
        Forecastday forecastday = objectMapper.readValue(json.optString("forecastday"), Forecastday.class);
        Hour hour = objectMapper.readValue(json.optString("hour"), Hour.class);
        Location location = objectMapper.readValue(json.optString("location"), Location.class);

        //Print to show what is being held by each object
//        System.out.println(astro + "\n");
//        System.out.println(condition + "\n");
//        System.out.println(condition_ + "\n");
//        System.out.println(condition__ + "\n");
//        System.out.println(current + "\n");
//        System.out.println(day + "\n");
//        System.out.println(forecast + "\n");
//        System.out.println(forecastday + "\n");
//        System.out.println(hour + "\n");
        System.out.println(location + "\n");

    }

    //Build a String from the read Json file
    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    //Reads and returns the JsonObject
    public JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

}
