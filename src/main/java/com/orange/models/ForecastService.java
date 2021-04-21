package com.orange.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class ForecastService {
    private String city;
    private int temperature;
    private String icon;
    private String description;
    private String specificDay;
    private List<Forecast> forecastList = new ArrayList<>();

    public ForecastService(String city) {
        this.city = city;
    }

    public void getForecastConnection() {
        String apiBase = "http://api.openweathermap.org/data/2.5/forecast?q=";
        String apiKey = "d0667dee227692564c03511ba5482dee";
        String units = "imperial";
        String lang = "en";


        JSONObject json;
        JSONObject specificJsonElement;
        JSONArray jsonArray;
        JSONArray jsonArray2;

        //Connects to the API to the json file
        try {
            String apiUrl = apiBase + URLEncoder.encode(city, "utf-8") + "&appid=" + apiKey + "&mode=json&units=" + units + "&lang=" + lang;
            System.out.println(apiUrl);
            json = readJsonFromUrl(apiUrl);
        } catch (Exception e) {
            return;
        }

        forecastList.clear();
        //get the specific data from the json file
        jsonArray = json.getJSONArray("list");
        for (int i = 1; i < jsonArray.length(); i++) {
            specificJsonElement = jsonArray.getJSONObject(i);
            temperature = specificJsonElement.getJSONObject("main").getInt("temp");
            specificJsonElement = jsonArray.getJSONObject(i);
            specificDay = specificJsonElement.get("dt_txt").toString();
            if (specificDay.contains("12:00:00")) {
                String[] pullDay = specificDay.split(" ");
                specificDay = pullDay[0];
                specificJsonElement = jsonArray.getJSONObject(i);
                jsonArray2 = specificJsonElement.getJSONArray("weather");
                specificJsonElement = jsonArray2.getJSONObject(0);
                description = specificJsonElement.getString("description");
                icon = specificJsonElement.get("icon").toString();
                Forecast forecast = new Forecast(temperature, icon, description, specificDay);
                forecastList.add(forecast);
            }

        }

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
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(bufferedReader);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public List<Forecast> getForecastList() {
        return forecastList;
    }

    public String getSpecificDay() {
        return specificDay;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }


    public int getTemperature() {
        return temperature;
    }

    public String getIcon() {
        return icon;
    }


}

