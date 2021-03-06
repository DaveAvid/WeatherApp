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
    private String jsonString;

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
        JSONObject specificJsonElement;

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
        jsonString = json.toString();
        System.out.println(jsonString);

        //get the specific data from the json file
        specificJsonElement = json.getJSONObject("main");
        pressure = specificJsonElement.get("pressure").toString();
        temperature = specificJsonElement.getInt("temp");
        humidity = specificJsonElement.get("humidity").toString();
        specificJsonElement = json.getJSONObject("wind");
        windSpeed = specificJsonElement.get("speed").toString();
        specificJsonElement = json.getJSONObject("clouds");
        cloudiness = specificJsonElement.get("all").toString();

        calendar.add(Calendar.DATE, day);
        this.day = dateFormat.format(calendar.getTime());

        specificJsonElement = json.getJSONArray("weather").getJSONObject(0);
        this.description = specificJsonElement.get("description").toString();
        this.icon = specificJsonElement.get("icon").toString();


    }

    public void writeJsonLocation(String jsonString, String location) throws IOException {
        //next, saves the file:
        FileWriter writer;
        BufferedWriter buffer;
        try {
            writer = new FileWriter("jsonLocation" + location + ".txt");
            buffer = new BufferedWriter(writer);
            buffer.write(jsonString);
            buffer.close();
        } catch (Exception ex) {
            System.out.println("error: " + ex.toString());
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

    public String getJsonString() {
        return jsonString;
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
