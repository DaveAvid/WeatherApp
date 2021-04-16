package com.orange.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class WeatherService {
    private String city;
    private String day;
    private int temperature;
    private String icon;
    private String windSpeed;
    private String pressure;
    private String humidity;
    private String cloudiness;
    private String description;

    public WeatherService(String city) {
        this.city = city;
    }

    public void getWeatherConnection() {
        int day = 0;
        String apiBase = "http://api.openweathermap.org/data/2.5/weather?q=";
        String apiKey = "ad72e9d8b12ec118ba1fbd72827337fd";
        String units = "imperial";
        String lang = "en";


        JSONObject json;
        JSONObject specificJson;

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();

        //Connects to the API to the json file
        try {
            String apiUrl = apiBase + URLEncoder.encode(city, "utf-8") + "&appid=" + apiKey + "&mode=json&units=" + units + "&lang=" + lang;
            System.out.println(apiUrl);
            json = readJsonFromUrl(apiUrl);
        } catch (Exception e) {
            return;
        }
        String jsonString = json.toString();
        System.out.println(jsonString);

        //next, saves the file:
        PrintWriter out1 = null;
        try {
            out1 = new PrintWriter(new FileWriter("json.txt"));
            out1.write(jsonString);
        } catch (Exception ex) {
            System.out.println("error: " + ex.toString());
        }

        //get the specific data from the json file
        specificJson = json.getJSONObject("main");
        pressure = specificJson.get("pressure").toString();
        temperature = specificJson.getInt("temp");
        humidity = specificJson.get("humidity").toString();
        specificJson = json.getJSONObject("wind");
        windSpeed = specificJson.get("speed").toString();
        specificJson = json.getJSONObject("clouds");
        cloudiness = specificJson.get("all").toString();

        calendar.add(Calendar.DATE, day);
        this.day = dateFormat.format(calendar.getTime());

        specificJson = json.getJSONArray("weather").getJSONObject(0);
        this.description = specificJson.get("description").toString();
        this.icon = specificJson.get("icon").toString();


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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public String getDay() {
        return day;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getIcon() {
        return icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getCloudiness() {
        return cloudiness;
    }


}
