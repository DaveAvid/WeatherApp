package com.orange.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Calendar;

public class ForecastService {
    private String city;
    private double temperature, temperature2, temperature3, temperature4, temperature5;
    private String icon, icon2, icon3, icon4, icon5;
    private String description, description2, description3, description4, description5;
    private String specificDay, specificDay2, specificDay3, specificDay4, specificDay5;

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
        JSONArray jsonArray2;

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
        specificJson = jsonArray.getJSONObject(1);
        temperature = specificJson.getJSONObject("main").getDouble("temp");
        specificJson = jsonArray.getJSONObject(1);
        specificDay = specificJson.get("dt_txt").toString();
        String[] pullDay = specificDay.split(" ");
        specificDay = pullDay[0];
        specificJson = jsonArray.getJSONObject(1);
        jsonArray2 = specificJson.getJSONArray("weather");
        specificJson = jsonArray2.getJSONObject(0);
        description = specificJson.getString("description");
        icon = specificJson.get("icon").toString();

        jsonArray = json.getJSONArray("list");
        specificJson = jsonArray.getJSONObject(6);
        temperature2 = specificJson.getJSONObject("main").getDouble("temp");
        specificJson = jsonArray.getJSONObject(6);
        specificDay2 = specificJson.get("dt_txt").toString();
        String[] pullDay2 = specificDay2.split(" ");
        specificDay2 = pullDay2[0];
        specificJson = jsonArray.getJSONObject(6);
        jsonArray2 = specificJson.getJSONArray("weather");
        specificJson = jsonArray2.getJSONObject(0);
        description2 = specificJson.getString("description");
        icon2 = specificJson.get("icon").toString();

        jsonArray = json.getJSONArray("list");
        specificJson = jsonArray.getJSONObject(14);
        temperature3 = specificJson.getJSONObject("main").getDouble("temp");
        specificJson = jsonArray.getJSONObject(14);
        specificDay3 = specificJson.get("dt_txt").toString();
        String[] pullDay3 = specificDay3.split(" ");
        specificDay3 = pullDay3[0];
        specificJson = jsonArray.getJSONObject(14);
        jsonArray2 = specificJson.getJSONArray("weather");
        specificJson = jsonArray2.getJSONObject(0);
        description3 = specificJson.getString("description");
        icon3 = specificJson.get("icon").toString();

        jsonArray = json.getJSONArray("list");
        specificJson = jsonArray.getJSONObject(22);
        temperature4 = specificJson.getJSONObject("main").getDouble("temp");
        specificJson = jsonArray.getJSONObject(22);
        specificDay4 = specificJson.get("dt_txt").toString();
        String[] pullDay4 = specificDay4.split(" ");
        specificDay4 = pullDay4[0];
        specificJson = jsonArray.getJSONObject(22);
        jsonArray2 = specificJson.getJSONArray("weather");
        specificJson = jsonArray2.getJSONObject(0);
        description4 = specificJson.getString("description");
        icon4 = specificJson.get("icon").toString();

        jsonArray = json.getJSONArray("list");
        specificJson = jsonArray.getJSONObject(30);
        temperature5 = specificJson.getJSONObject("main").getDouble("temp");
        specificJson = jsonArray.getJSONObject(30);
        specificDay5 = specificJson.get("dt_txt").toString();
        String[] pullDay5 = specificDay5.split(" ");
        specificDay5 = pullDay5[0];
        specificJson = jsonArray.getJSONObject(30);
        jsonArray2 = specificJson.getJSONArray("weather");
        specificJson = jsonArray2.getJSONObject(0);
        description5 = specificJson.getString("description");
        icon5 = specificJson.get("icon").toString();
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }


    public double getTemperature() {
        return temperature;
    }

    public String getIcon() {
        return icon;
    }

    public double getTemperature2() {
        return temperature2;
    }

    public double getTemperature3() {
        return temperature3;
    }

    public double getTemperature4() {
        return temperature4;
    }

    public double getTemperature5() {
        return temperature5;
    }

    public String getIcon2() {
        return icon2;
    }

    public String getIcon3() {
        return icon3;
    }

    public String getIcon4() {
        return icon4;
    }

    public String getIcon5() {
        return icon5;
    }

    public String getDescription2() {
        return description2;
    }

    public String getDescription3() {
        return description3;
    }

    public String getDescription4() {
        return description4;
    }

    public String getDescription5() {
        return description5;
    }

    public String getSpecificDay2() {
        return specificDay2;
    }

    public String getSpecificDay3() {
        return specificDay3;
    }

    public String getSpecificDay4() {
        return specificDay4;
    }

    public String getSpecificDay5() {
        return specificDay5;
    }
}

