package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.*;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherHandler {

        JSONObject json = new JSONObject();
        ObjectMapper objectMapper = new ObjectMapper();
    public void weatherConnection(String cityState) throws IOException {
        String key = "bc8fcd2f89d248fb93c162946202810";
        String forecastUrl = "http://api.weatherapi.com/v1/forecast.json?key=bc8fcd2f89d248fb93c162946202810&q=Rochester,MN&days=7";
        String currentUrl = "http://api.weatherapi.com/v1/forecast.json?key=bc8fcd2f89d248fb93c162946202810&q="+cityState+"&days=7";
        json = readJsonFromUrl(currentUrl);
        Astro astro = objectMapper.readValue(json.toString(), Astro.class);
        Condition condition = objectMapper.readValue(json.toString(),Condition.class);
        Condition_ condition_  = objectMapper.readValue(json.toString(),Condition_.class);
        Condition__ condition__ = objectMapper.readValue(json.toString(),Condition__.class);
        Current current = objectMapper.readValue(json.toString(), Current.class);
        Day day = objectMapper.readValue(json.toString(),Day.class);
        Forecast forecast = objectMapper.readValue(json.toString(),Forecast.class);
        Forecastday forecastday = objectMapper.readValue(json.toString(),Forecastday.class);
        Hour hour = objectMapper.readValue(json.toString(),Hour.class);
        Location location = objectMapper.readValue(json.toString(),Location.class);
    }
    //Build a String from the read Json file
    private  String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    //Reads and returns the JsonObject
    public  JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
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
