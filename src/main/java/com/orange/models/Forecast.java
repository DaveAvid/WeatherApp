package com.orange.models;

public class Forecast {
    private String city;
    private int temperature;
    private String icon;
    private String description;
    private String specificDay;

    public Forecast(int temperature, String icon, String description, String specificDay) {
        this.temperature = temperature;
        this.icon = icon;
        this.description = description;
        this.specificDay = specificDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecificDay() {
        return specificDay;
    }

    public void setSpecificDay(String specificDay) {
        this.specificDay = specificDay;
    }
}
