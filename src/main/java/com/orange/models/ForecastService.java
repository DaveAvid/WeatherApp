package com.orange.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;

public class ForecastService {
    private String city;
    private String epochDay;
    private double temperature;
    private String icon;
    private String description;
    private Date newDate;
    private String specificDay;

    public ForecastService(String city) {
        this.city = city;
    }

    public void getForecastConnection() {
        int day = 0;
        String apiBase = "http://api.openweathermap.org/data/2.5/forecast?q=";
        String apiKey = "d0667dee227692564c03511ba5482dee";
        String units = "imperial";
        String lang = "en";


        JSONObject json;
        JSONObject specificJson;
        JSONArray jsonArray;


        Calendar calendar = Calendar.getInstance();

        //Connects to the API to the json file
        try {
            String apiUrl = apiBase + URLEncoder.encode(city, "utf-8") + "&appid=" + apiKey + "&mode=json&units=" + units + "&lang=" + lang;
            System.out.println(apiUrl);
            json = readJsonFromUrl(apiUrl);
        } catch (Exception e) {
            return;
        }

        //get the specific data from the json file

        jsonArray = json.getJSONArray("list");
        for (int i = 0; i < jsonArray.length(); i += 3) {
            specificJson = jsonArray.getJSONObject(i);
            temperature = specificJson.getJSONObject("main").getDouble("temp");
            specificJson = json.getJSONArray("list").getJSONObject(i);
            epochDay = specificJson.get("dt").toString();
            calendar.add(Calendar.DATE, day);
            long epoch = Long.parseLong(epochDay);
            newDate = new Date(epoch * 1000);
            String[] pullDay = newDate.toString().split(" ");
            specificDay = pullDay[0];

            specificJson = jsonArray.getJSONObject(i);
            jsonArray = specificJson.getJSONArray("weather");
            specificJson = jsonArray.getJSONObject(i);
            description = specificJson.getString("description");
            icon = specificJson.get("icon").toString();
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

    public String getSpecificDay() {
        return specificDay;
    }

    public Date getNewDate() {
        return newDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public String getEpochDay() {
        return epochDay;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getIcon() {
        return icon;
    }


}

