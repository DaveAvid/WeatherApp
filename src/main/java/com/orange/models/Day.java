package com.orange.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "avgvis_km",
        "uv",
        "avgtemp_f",
        "avgtemp_c",
        "daily_chance_of_snow",
        "maxtemp_c",
        "maxtemp_f",
        "mintemp_c",
        "avgvis_miles",
        "daily_will_it_rain",
        "mintemp_f",
        "totalprecip_in",
        "avghumidity",
        "condition",
        "maxwind_kph",
        "maxwind_mph",
        "daily_chance_of_rain",
        "totalprecip_mm",
        "daily_will_it_snow"
})
public class Day {

    @JsonProperty("avgvis_km")
    private double avgvisKm;
    @JsonProperty("uv")
    private int uv;
    @JsonProperty("avgtemp_f")
    private double avgtempF;
    @JsonProperty("avgtemp_c")
    private double avgtempC;
    @JsonProperty("daily_chance_of_snow")
    private String dailyChanceOfSnow;
    @JsonProperty("maxtemp_c")
    private double maxtempC;
    @JsonProperty("maxtemp_f")
    private double maxtempF;
    @JsonProperty("mintemp_c")
    private double mintempC;
    @JsonProperty("avgvis_miles")
    private int avgvisMiles;
    @JsonProperty("daily_will_it_rain")
    private int dailyWillItRain;
    @JsonProperty("mintemp_f")
    private double mintempF;
    @JsonProperty("totalprecip_in")
    private double totalprecipIn;
    @JsonProperty("avghumidity")
    private int avghumidity;
    @JsonProperty("condition")
    private Condition__ condition;
    @JsonProperty("maxwind_kph")
    private double maxwindKph;
    @JsonProperty("maxwind_mph")
    private double maxwindMph;
    @JsonProperty("daily_chance_of_rain")
    private String dailyChanceOfRain;
    @JsonProperty("totalprecip_mm")
    private double totalprecipMm;
    @JsonProperty("daily_will_it_snow")
    private int dailyWillItSnow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Day() {
    }

    /**
     * @param uv
     * @param dailyWillItRain
     * @param dailyChanceOfRain
     * @param avgtempF
     * @param mintempC
     * @param totalprecipMm
     * @param dailyWillItSnow
     * @param totalprecipIn
     * @param avghumidity
     * @param condition
     * @param avgvisKm
     * @param mintempF
     * @param maxwindMph
     * @param maxwindKph
     * @param dailyChanceOfSnow
     * @param maxtempF
     * @param avgtempC
     * @param maxtempC
     * @param avgvisMiles
     */
    public Day(double avgvisKm, int uv, double avgtempF, double avgtempC, String dailyChanceOfSnow, double maxtempC, double maxtempF, double mintempC, int avgvisMiles, int dailyWillItRain, double mintempF, double totalprecipIn, int avghumidity, Condition__ condition, double maxwindKph, double maxwindMph, String dailyChanceOfRain, double totalprecipMm, int dailyWillItSnow) {
        super();
        this.avgvisKm = avgvisKm;
        this.uv = uv;
        this.avgtempF = avgtempF;
        this.avgtempC = avgtempC;
        this.dailyChanceOfSnow = dailyChanceOfSnow;
        this.maxtempC = maxtempC;
        this.maxtempF = maxtempF;
        this.mintempC = mintempC;
        this.avgvisMiles = avgvisMiles;
        this.dailyWillItRain = dailyWillItRain;
        this.mintempF = mintempF;
        this.totalprecipIn = totalprecipIn;
        this.avghumidity = avghumidity;
        this.condition = condition;
        this.maxwindKph = maxwindKph;
        this.maxwindMph = maxwindMph;
        this.dailyChanceOfRain = dailyChanceOfRain;
        this.totalprecipMm = totalprecipMm;
        this.dailyWillItSnow = dailyWillItSnow;
    }

    @JsonProperty("avgvis_km")
    public double getAvgvisKm() {
        return avgvisKm;
    }

    @JsonProperty("avgvis_km")
    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    @JsonProperty("uv")
    public int getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(int uv) {
        this.uv = uv;
    }

    @JsonProperty("avgtemp_f")
    public double getAvgtempF() {
        return avgtempF;
    }

    @JsonProperty("avgtemp_f")
    public void setAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
    }

    @JsonProperty("avgtemp_c")
    public double getAvgtempC() {
        return avgtempC;
    }

    @JsonProperty("avgtemp_c")
    public void setAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
    }

    @JsonProperty("daily_chance_of_snow")
    public String getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    @JsonProperty("daily_chance_of_snow")
    public void setDailyChanceOfSnow(String dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    @JsonProperty("maxtemp_c")
    public double getMaxtempC() {
        return maxtempC;
    }

    @JsonProperty("maxtemp_c")
    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    @JsonProperty("maxtemp_f")
    public double getMaxtempF() {
        return maxtempF;
    }

    @JsonProperty("maxtemp_f")
    public void setMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
    }

    @JsonProperty("mintemp_c")
    public double getMintempC() {
        return mintempC;
    }

    @JsonProperty("mintemp_c")
    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    @JsonProperty("avgvis_miles")
    public int getAvgvisMiles() {
        return avgvisMiles;
    }

    @JsonProperty("avgvis_miles")
    public void setAvgvisMiles(int avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    @JsonProperty("daily_will_it_rain")
    public int getDailyWillItRain() {
        return dailyWillItRain;
    }

    @JsonProperty("daily_will_it_rain")
    public void setDailyWillItRain(int dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    @JsonProperty("mintemp_f")
    public double getMintempF() {
        return mintempF;
    }

    @JsonProperty("mintemp_f")
    public void setMintempF(double mintempF) {
        this.mintempF = mintempF;
    }

    @JsonProperty("totalprecip_in")
    public double getTotalprecipIn() {
        return totalprecipIn;
    }

    @JsonProperty("totalprecip_in")
    public void setTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    @JsonProperty("avghumidity")
    public int getAvghumidity() {
        return avghumidity;
    }

    @JsonProperty("avghumidity")
    public void setAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
    }

    @JsonProperty("condition")
    public Condition__ getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition__ condition) {
        this.condition = condition;
    }

    @JsonProperty("maxwind_kph")
    public double getMaxwindKph() {
        return maxwindKph;
    }

    @JsonProperty("maxwind_kph")
    public void setMaxwindKph(double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    @JsonProperty("maxwind_mph")
    public double getMaxwindMph() {
        return maxwindMph;
    }

    @JsonProperty("maxwind_mph")
    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }


    @JsonProperty("daily_chance_of_rain")
    public String getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    @JsonProperty("daily_chance_of_rain")
    public void setDailyChanceOfRain(String dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }


    @JsonProperty("totalprecip_mm")
    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    @JsonProperty("totalprecip_mm")
    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }


    @JsonProperty("daily_will_it_snow")
    public int getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    @JsonProperty("daily_will_it_snow")
    public void setDailyWillItSnow(int dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Day withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("avgvisKm", avgvisKm).append("uv", uv).append("avgtempF", avgtempF).append("avgtempC", avgtempC).append("dailyChanceOfSnow", dailyChanceOfSnow).append("maxtempC", maxtempC).append("maxtempF", maxtempF).append("mintempC", mintempC).append("avgvisMiles", avgvisMiles).append("dailyWillItRain", dailyWillItRain).append("mintempF", mintempF).append("totalprecipIn", totalprecipIn).append("avghumidity", avghumidity).append("condition", condition).append("maxwindKph", maxwindKph).append("maxwindMph", maxwindMph).append("dailyChanceOfRain", dailyChanceOfRain).append("totalprecipMm", totalprecipMm).append("dailyWillItSnow", dailyWillItSnow).append("additionalProperties", additionalProperties).toString();
    }

}