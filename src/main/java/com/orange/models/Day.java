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
     *
     */
    public Day() {
    }

    /**
     *
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

    public Day withAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
        return this;
    }

    @JsonProperty("uv")
    public int getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(int uv) {
        this.uv = uv;
    }

    public Day withUv(int uv) {
        this.uv = uv;
        return this;
    }

    @JsonProperty("avgtemp_f")
    public double getAvgtempF() {
        return avgtempF;
    }

    @JsonProperty("avgtemp_f")
    public void setAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
    }

    public Day withAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
        return this;
    }

    @JsonProperty("avgtemp_c")
    public double getAvgtempC() {
        return avgtempC;
    }

    @JsonProperty("avgtemp_c")
    public void setAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
    }

    public Day withAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
        return this;
    }

    @JsonProperty("daily_chance_of_snow")
    public String getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    @JsonProperty("daily_chance_of_snow")
    public void setDailyChanceOfSnow(String dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    public Day withDailyChanceOfSnow(String dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
        return this;
    }

    @JsonProperty("maxtemp_c")
    public double getMaxtempC() {
        return maxtempC;
    }

    @JsonProperty("maxtemp_c")
    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    public Day withMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
        return this;
    }

    @JsonProperty("maxtemp_f")
    public double getMaxtempF() {
        return maxtempF;
    }

    @JsonProperty("maxtemp_f")
    public void setMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
    }

    public Day withMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
        return this;
    }

    @JsonProperty("mintemp_c")
    public double getMintempC() {
        return mintempC;
    }

    @JsonProperty("mintemp_c")
    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    public Day withMintempC(double mintempC) {
        this.mintempC = mintempC;
        return this;
    }

    @JsonProperty("avgvis_miles")
    public int getAvgvisMiles() {
        return avgvisMiles;
    }

    @JsonProperty("avgvis_miles")
    public void setAvgvisMiles(int avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    public Day withAvgvisMiles(int avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
        return this;
    }

    @JsonProperty("daily_will_it_rain")
    public int getDailyWillItRain() {
        return dailyWillItRain;
    }

    @JsonProperty("daily_will_it_rain")
    public void setDailyWillItRain(int dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    public Day withDailyWillItRain(int dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
        return this;
    }

    @JsonProperty("mintemp_f")
    public double getMintempF() {
        return mintempF;
    }

    @JsonProperty("mintemp_f")
    public void setMintempF(double mintempF) {
        this.mintempF = mintempF;
    }

    public Day withMintempF(double mintempF) {
        this.mintempF = mintempF;
        return this;
    }

    @JsonProperty("totalprecip_in")
    public double getTotalprecipIn() {
        return totalprecipIn;
    }

    @JsonProperty("totalprecip_in")
    public void setTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    public Day withTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
        return this;
    }

    @JsonProperty("avghumidity")
    public int getAvghumidity() {
        return avghumidity;
    }

    @JsonProperty("avghumidity")
    public void setAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Day withAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
        return this;
    }

    @JsonProperty("condition")
    public Condition__ getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition__ condition) {
        this.condition = condition;
    }

    public Day withCondition(Condition__ condition) {
        this.condition = condition;
        return this;
    }

    @JsonProperty("maxwind_kph")
    public double getMaxwindKph() {
        return maxwindKph;
    }

    @JsonProperty("maxwind_kph")
    public void setMaxwindKph(double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    public Day withMaxwindKph(double maxwindKph) {
        this.maxwindKph = maxwindKph;
        return this;
    }

    @JsonProperty("maxwind_mph")
    public double getMaxwindMph() {
        return maxwindMph;
    }

    @JsonProperty("maxwind_mph")
    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    public Day withMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
        return this;
    }

    @JsonProperty("daily_chance_of_rain")
    public String getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    @JsonProperty("daily_chance_of_rain")
    public void setDailyChanceOfRain(String dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public Day withDailyChanceOfRain(String dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
        return this;
    }

    @JsonProperty("totalprecip_mm")
    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    @JsonProperty("totalprecip_mm")
    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    public Day withTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
        return this;
    }

    @JsonProperty("daily_will_it_snow")
    public int getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    @JsonProperty("daily_will_it_snow")
    public void setDailyWillItSnow(int dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    public Day withDailyWillItSnow(int dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
        return this;
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