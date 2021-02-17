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
        "feelslike_c",
        "uv",
        "last_updated",
        "feelslike_f",
        "wind_degree",
        "last_updated_epoch",
        "is_day",
        "precip_in",
        "wind_dir",
        "gust_mph",
        "temp_c",
        "pressure_in",
        "gust_kph",
        "temp_f",
        "precip_mm",
        "cloud",
        "wind_kph",
        "condition",
        "wind_mph",
        "vis_km",
        "humidity",
        "pressure_mb",
        "vis_miles"
})
public class Current {

    @JsonProperty("feelslike_c")
    private double feelslikeC;
    @JsonProperty("uv")
    private int uv;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("feelslike_f")
    private double feelslikeF;
    @JsonProperty("wind_degree")
    private int windDegree;
    @JsonProperty("last_updated_epoch")
    private int lastUpdatedEpoch;
    @JsonProperty("is_day")
    private int isDay;
    @JsonProperty("precip_in")
    private int precipIn;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("gust_mph")
    private double gustMph;
    @JsonProperty("temp_c")
    private double tempC;
    @JsonProperty("pressure_in")
    private double pressureIn;
    @JsonProperty("gust_kph")
    private double gustKph;
    @JsonProperty("temp_f")
    private int tempF;
    @JsonProperty("precip_mm")
    private int precipMm;
    @JsonProperty("cloud")
    private int cloud;
    @JsonProperty("wind_kph")
    private double windKph;
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("wind_mph")
    private double windMph;
    @JsonProperty("vis_km")
    private double visKm;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("pressure_mb")
    private int pressureMb;
    @JsonProperty("vis_miles")
    private int visMiles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Current() {
    }

    /**
     * @param tempF
     * @param precipMm
     * @param uv
     * @param feelslikeC
     * @param gustMph
     * @param gustKph
     * @param precipIn
     * @param windDir
     * @param pressureIn
     * @param isDay
     * @param cloud
     * @param lastUpdated
     * @param condition
     * @param windMph
     * @param visKm
     * @param windKph
     * @param feelslikeF
     * @param humidity
     * @param windDegree
     * @param visMiles
     * @param pressureMb
     * @param lastUpdatedEpoch
     * @param tempC
     */
    public Current(double feelslikeC, int uv, String lastUpdated, double feelslikeF, int windDegree, int lastUpdatedEpoch, int isDay, int precipIn, String windDir, double gustMph, double tempC, double pressureIn, double gustKph, int tempF, int precipMm, int cloud, double windKph, Condition condition, double windMph, double visKm, int humidity, int pressureMb, int visMiles) {
        super();
        this.feelslikeC = feelslikeC;
        this.uv = uv;
        this.lastUpdated = lastUpdated;
        this.feelslikeF = feelslikeF;
        this.windDegree = windDegree;
        this.lastUpdatedEpoch = lastUpdatedEpoch;
        this.isDay = isDay;
        this.precipIn = precipIn;
        this.windDir = windDir;
        this.gustMph = gustMph;
        this.tempC = tempC;
        this.pressureIn = pressureIn;
        this.gustKph = gustKph;
        this.tempF = tempF;
        this.precipMm = precipMm;
        this.cloud = cloud;
        this.windKph = windKph;
        this.condition = condition;
        this.windMph = windMph;
        this.visKm = visKm;
        this.humidity = humidity;
        this.pressureMb = pressureMb;
        this.visMiles = visMiles;
    }

    @JsonProperty("feelslike_c")
    public double getFeelslikeC() {
        return feelslikeC;
    }

    @JsonProperty("feelslike_c")
    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    @JsonProperty("uv")
    public int getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(int uv) {
        this.uv = uv;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("feelslike_f")
    public double getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    @JsonProperty("wind_degree")
    public int getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    @JsonProperty("last_updated_epoch")
    public int getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    @JsonProperty("last_updated_epoch")
    public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    @JsonProperty("is_day")
    public int getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    @JsonProperty("precip_in")
    public int getPrecipIn() {
        return precipIn;
    }

    @JsonProperty("precip_in")
    public void setPrecipIn(int precipIn) {
        this.precipIn = precipIn;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("gust_mph")
    public double getGustMph() {
        return gustMph;
    }

    @JsonProperty("gust_mph")
    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    @JsonProperty("temp_c")
    public double getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("pressure_in")
    public double getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    @JsonProperty("gust_kph")
    public double getGustKph() {
        return gustKph;
    }

    @JsonProperty("gust_kph")
    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

    @JsonProperty("temp_f")
    public int getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(int tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("precip_mm")
    public int getPrecipMm() {
        return precipMm;
    }

    @JsonProperty("precip_mm")
    public void setPrecipMm(int precipMm) {
        this.precipMm = precipMm;
    }

    @JsonProperty("cloud")
    public int getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    @JsonProperty("wind_kph")
    public double getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @JsonProperty("wind_mph")
    public double getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    @JsonProperty("vis_km")
    public double getVisKm() {
        return visKm;
    }

    @JsonProperty("vis_km")
    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("pressure_mb")
    public int getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(int pressureMb) {
        this.pressureMb = pressureMb;
    }

    @JsonProperty("vis_miles")
    public int getVisMiles() {
        return visMiles;
    }

    @JsonProperty("vis_miles")
    public void setVisMiles(int visMiles) {
        this.visMiles = visMiles;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Current withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("feelslikeC", feelslikeC).append("uv", uv).append("lastUpdated", lastUpdated).append("feelslikeF", feelslikeF).append("windDegree", windDegree).append("lastUpdatedEpoch", lastUpdatedEpoch).append("isDay", isDay).append("precipIn", precipIn).append("windDir", windDir).append("gustMph", gustMph).append("tempC", tempC).append("pressureIn", pressureIn).append("gustKph", gustKph).append("tempF", tempF).append("precipMm", precipMm).append("cloud", cloud).append("windKph", windKph).append("condition", condition).append("windMph", windMph).append("visKm", visKm).append("humidity", humidity).append("pressureMb", pressureMb).append("visMiles", visMiles).append("additionalProperties", additionalProperties).toString();
    }

}