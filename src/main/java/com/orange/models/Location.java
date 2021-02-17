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
        "localtime",
        "country",
        "localtime_epoch",
        "name",
        "lon",
        "region",
        "lat",
        "tz_id"
})
public class Location {

    @JsonProperty("localtime")
    private String localtime;
    @JsonProperty("country")
    private String country;
    @JsonProperty("localtime_epoch")
    private int localtimeEpoch;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("region")
    private String region;
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("tz_id")
    private String tzId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Location() {
    }

    /**
     * @param localtime
     * @param country
     * @param localtimeEpoch
     * @param tzId
     * @param name
     * @param lon
     * @param region
     * @param lat
     */
    public Location(String localtime, String country, int localtimeEpoch, String name, double lon, String region, double lat, String tzId) {
        super();
        this.localtime = localtime;
        this.country = country;
        this.localtimeEpoch = localtimeEpoch;
        this.name = name;
        this.lon = lon;
        this.region = region;
        this.lat = lat;
        this.tzId = tzId;
    }

    @JsonProperty("localtime")
    public String getLocaltime() {
        return localtime;
    }

    @JsonProperty("localtime")
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("localtime_epoch")
    public int getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    @JsonProperty("localtime_epoch")
    public void setLocaltimeEpoch(int localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("lon")
    public double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(double lon) {
        this.lon = lon;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(double lat) {
        this.lat = lat;
    }

    @JsonProperty("tz_id")
    public String getTzId() {
        return tzId;
    }

    @JsonProperty("tz_id")
    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("localtime", localtime).append("country", country).append("localtimeEpoch", localtimeEpoch).append("name", name).append("lon", lon).append("region", region).append("lat", lat).append("tzId", tzId).append("additionalProperties", additionalProperties).toString();
    }

}