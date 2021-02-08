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
        "feelslike_f",
        "wind_degree",
        "windchill_f",
        "windchill_c",
        "temp_c",
        "temp_f",
        "cloud",
        "wind_kph",
        "wind_mph",
        "humidity",
        "dewpoint_f",
        "will_it_rain",
        "uv",
        "heatindex_f",
        "dewpoint_c",
        "is_day",
        "precip_in",
        "heatindex_c",
        "wind_dir",
        "gust_mph",
        "pressure_in",
        "chance_of_rain",
        "gust_kph",
        "precip_mm",
        "condition",
        "will_it_snow",
        "vis_km",
        "time_epoch",
        "time",
        "chance_of_snow",
        "pressure_mb",
        "vis_miles"
})
public class Hour {

    @JsonProperty("feelslike_c")
    private double feelslikeC;
    @JsonProperty("feelslike_f")
    private double feelslikeF;
    @JsonProperty("wind_degree")
    private int windDegree;
    @JsonProperty("windchill_f")
    private double windchillF;
    @JsonProperty("windchill_c")
    private double windchillC;
    @JsonProperty("temp_c")
    private double tempC;
    @JsonProperty("temp_f")
    private double tempF;
    @JsonProperty("cloud")
    private int cloud;
    @JsonProperty("wind_kph")
    private double windKph;
    @JsonProperty("wind_mph")
    private double windMph;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("dewpoint_f")
    private double dewpointF;
    @JsonProperty("will_it_rain")
    private int willItRain;
    @JsonProperty("uv")
    private int uv;
    @JsonProperty("heatindex_f")
    private double heatindexF;
    @JsonProperty("dewpoint_c")
    private double dewpointC;
    @JsonProperty("is_day")
    private int isDay;
    @JsonProperty("precip_in")
    private double precipIn;
    @JsonProperty("heatindex_c")
    private double heatindexC;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("gust_mph")
    private double gustMph;
    @JsonProperty("pressure_in")
    private double pressureIn;
    @JsonProperty("chance_of_rain")
    private String chanceOfRain;
    @JsonProperty("gust_kph")
    private double gustKph;
    @JsonProperty("precip_mm")
    private double precipMm;
    @JsonProperty("condition")
    private Condition_ condition;
    @JsonProperty("will_it_snow")
    private int willItSnow;
    @JsonProperty("vis_km")
    private int visKm;
    @JsonProperty("time_epoch")
    private int timeEpoch;
    @JsonProperty("time")
    private String time;
    @JsonProperty("chance_of_snow")
    private String chanceOfSnow;
    @JsonProperty("pressure_mb")
    private int pressureMb;
    @JsonProperty("vis_miles")
    private int visMiles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Hour() {
    }

    /**
     *
     * @param heatindexF
     * @param precipMm
     * @param timeEpoch
     * @param feelslikeC
     * @param heatindexC
     * @param gustMph
     * @param gustKph
     * @param dewpointC
     * @param precipIn
     * @param windDir
     * @param pressureIn
     * @param chanceOfRain
     * @param dewpointF
     * @param cloud
     * @param windMph
     * @param visKm
     * @param windKph
     * @param humidity
     * @param windDegree
     * @param chanceOfSnow
     * @param visMiles
     * @param tempF
     * @param willItRain
     * @param uv
     * @param windchillC
     * @param windchillF
     * @param isDay
     * @param willItSnow
     * @param condition
     * @param feelslikeF
     * @param time
     * @param pressureMb
     * @param tempC
     */
    public Hour(double feelslikeC, double feelslikeF, int windDegree, double windchillF, double windchillC, double tempC, double tempF, int cloud, double windKph, double windMph, int humidity, double dewpointF, int willItRain, int uv, double heatindexF, double dewpointC, int isDay, double precipIn, double heatindexC, String windDir, double gustMph, double pressureIn, String chanceOfRain, double gustKph, double precipMm, Condition_ condition, int willItSnow, int visKm, int timeEpoch, String time, String chanceOfSnow, int pressureMb, int visMiles) {
        super();
        this.feelslikeC = feelslikeC;
        this.feelslikeF = feelslikeF;
        this.windDegree = windDegree;
        this.windchillF = windchillF;
        this.windchillC = windchillC;
        this.tempC = tempC;
        this.tempF = tempF;
        this.cloud = cloud;
        this.windKph = windKph;
        this.windMph = windMph;
        this.humidity = humidity;
        this.dewpointF = dewpointF;
        this.willItRain = willItRain;
        this.uv = uv;
        this.heatindexF = heatindexF;
        this.dewpointC = dewpointC;
        this.isDay = isDay;
        this.precipIn = precipIn;
        this.heatindexC = heatindexC;
        this.windDir = windDir;
        this.gustMph = gustMph;
        this.pressureIn = pressureIn;
        this.chanceOfRain = chanceOfRain;
        this.gustKph = gustKph;
        this.precipMm = precipMm;
        this.condition = condition;
        this.willItSnow = willItSnow;
        this.visKm = visKm;
        this.timeEpoch = timeEpoch;
        this.time = time;
        this.chanceOfSnow = chanceOfSnow;
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

    public Hour withFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
        return this;
    }

    @JsonProperty("feelslike_f")
    public double getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Hour withFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
        return this;
    }

    @JsonProperty("wind_degree")
    public int getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public Hour withWindDegree(int windDegree) {
        this.windDegree = windDegree;
        return this;
    }

    @JsonProperty("windchill_f")
    public double getWindchillF() {
        return windchillF;
    }

    @JsonProperty("windchill_f")
    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    public Hour withWindchillF(double windchillF) {
        this.windchillF = windchillF;
        return this;
    }

    @JsonProperty("windchill_c")
    public double getWindchillC() {
        return windchillC;
    }

    @JsonProperty("windchill_c")
    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    public Hour withWindchillC(double windchillC) {
        this.windchillC = windchillC;
        return this;
    }

    @JsonProperty("temp_c")
    public double getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public Hour withTempC(double tempC) {
        this.tempC = tempC;
        return this;
    }

    @JsonProperty("temp_f")
    public double getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public Hour withTempF(double tempF) {
        this.tempF = tempF;
        return this;
    }

    @JsonProperty("cloud")
    public int getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public Hour withCloud(int cloud) {
        this.cloud = cloud;
        return this;
    }

    @JsonProperty("wind_kph")
    public double getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public Hour withWindKph(double windKph) {
        this.windKph = windKph;
        return this;
    }

    @JsonProperty("wind_mph")
    public double getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public Hour withWindMph(double windMph) {
        this.windMph = windMph;
        return this;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Hour withHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    @JsonProperty("dewpoint_f")
    public double getDewpointF() {
        return dewpointF;
    }

    @JsonProperty("dewpoint_f")
    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Hour withDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
        return this;
    }

    @JsonProperty("will_it_rain")
    public int getWillItRain() {
        return willItRain;
    }

    @JsonProperty("will_it_rain")
    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    public Hour withWillItRain(int willItRain) {
        this.willItRain = willItRain;
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

    public Hour withUv(int uv) {
        this.uv = uv;
        return this;
    }

    @JsonProperty("heatindex_f")
    public double getHeatindexF() {
        return heatindexF;
    }

    @JsonProperty("heatindex_f")
    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public Hour withHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
        return this;
    }

    @JsonProperty("dewpoint_c")
    public double getDewpointC() {
        return dewpointC;
    }

    @JsonProperty("dewpoint_c")
    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Hour withDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
        return this;
    }

    @JsonProperty("is_day")
    public int getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Hour withIsDay(int isDay) {
        this.isDay = isDay;
        return this;
    }

    @JsonProperty("precip_in")
    public double getPrecipIn() {
        return precipIn;
    }

    @JsonProperty("precip_in")
    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public Hour withPrecipIn(double precipIn) {
        this.precipIn = precipIn;
        return this;
    }

    @JsonProperty("heatindex_c")
    public double getHeatindexC() {
        return heatindexC;
    }

    @JsonProperty("heatindex_c")
    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public Hour withHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
        return this;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Hour withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    @JsonProperty("gust_mph")
    public double getGustMph() {
        return gustMph;
    }

    @JsonProperty("gust_mph")
    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    public Hour withGustMph(double gustMph) {
        this.gustMph = gustMph;
        return this;
    }

    @JsonProperty("pressure_in")
    public double getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public Hour withPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
        return this;
    }

    @JsonProperty("chance_of_rain")
    public String getChanceOfRain() {
        return chanceOfRain;
    }

    @JsonProperty("chance_of_rain")
    public void setChanceOfRain(String chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public Hour withChanceOfRain(String chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
        return this;
    }

    @JsonProperty("gust_kph")
    public double getGustKph() {
        return gustKph;
    }

    @JsonProperty("gust_kph")
    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

    public Hour withGustKph(double gustKph) {
        this.gustKph = gustKph;
        return this;
    }

    @JsonProperty("precip_mm")
    public double getPrecipMm() {
        return precipMm;
    }

    @JsonProperty("precip_mm")
    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public Hour withPrecipMm(double precipMm) {
        this.precipMm = precipMm;
        return this;
    }

    @JsonProperty("condition")
    public Condition_ getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition_ condition) {
        this.condition = condition;
    }

    public Hour withCondition(Condition_ condition) {
        this.condition = condition;
        return this;
    }

    @JsonProperty("will_it_snow")
    public int getWillItSnow() {
        return willItSnow;
    }

    @JsonProperty("will_it_snow")
    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    public Hour withWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
        return this;
    }

    @JsonProperty("vis_km")
    public int getVisKm() {
        return visKm;
    }

    @JsonProperty("vis_km")
    public void setVisKm(int visKm) {
        this.visKm = visKm;
    }

    public Hour withVisKm(int visKm) {
        this.visKm = visKm;
        return this;
    }

    @JsonProperty("time_epoch")
    public int getTimeEpoch() {
        return timeEpoch;
    }

    @JsonProperty("time_epoch")
    public void setTimeEpoch(int timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public Hour withTimeEpoch(int timeEpoch) {
        this.timeEpoch = timeEpoch;
        return this;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    public Hour withTime(String time) {
        this.time = time;
        return this;
    }

    @JsonProperty("chance_of_snow")
    public String getChanceOfSnow() {
        return chanceOfSnow;
    }

    @JsonProperty("chance_of_snow")
    public void setChanceOfSnow(String chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public Hour withChanceOfSnow(String chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
        return this;
    }

    @JsonProperty("pressure_mb")
    public int getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(int pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Hour withPressureMb(int pressureMb) {
        this.pressureMb = pressureMb;
        return this;
    }

    @JsonProperty("vis_miles")
    public int getVisMiles() {
        return visMiles;
    }

    @JsonProperty("vis_miles")
    public void setVisMiles(int visMiles) {
        this.visMiles = visMiles;
    }

    public Hour withVisMiles(int visMiles) {
        this.visMiles = visMiles;
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

    public Hour withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("feelslikeC", feelslikeC).append("feelslikeF", feelslikeF).append("windDegree", windDegree).append("windchillF", windchillF).append("windchillC", windchillC).append("tempC", tempC).append("tempF", tempF).append("cloud", cloud).append("windKph", windKph).append("windMph", windMph).append("humidity", humidity).append("dewpointF", dewpointF).append("willItRain", willItRain).append("uv", uv).append("heatindexF", heatindexF).append("dewpointC", dewpointC).append("isDay", isDay).append("precipIn", precipIn).append("heatindexC", heatindexC).append("windDir", windDir).append("gustMph", gustMph).append("pressureIn", pressureIn).append("chanceOfRain", chanceOfRain).append("gustKph", gustKph).append("precipMm", precipMm).append("condition", condition).append("willItSnow", willItSnow).append("visKm", visKm).append("timeEpoch", timeEpoch).append("time", time).append("chanceOfSnow", chanceOfSnow).append("pressureMb", pressureMb).append("visMiles", visMiles).append("additionalProperties", additionalProperties).toString();
    }

}