package com.orange.models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

public class Astro {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "moonset",
            "moon_illumination",
            "sunrise",
            "moon_phase",
            "sunset",
            "moonrise"
    })

    @JsonProperty("moonset")
    private String moonset;
    @JsonProperty("moon_illumination")
    private String moonIllumination;
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("moon_phase")
    private String moonPhase;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("moonrise")
    private String moonrise;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Astro() {
    }

    /**
     * @param moonset
     * @param sunrise
     * @param sunset
     * @param moonrise
     * @param moonIllumination
     * @param moonPhase
     */
    public Astro(String moonset, String moonIllumination, String sunrise, String moonPhase, String sunset, String moonrise) {
        super();
        this.moonset = moonset;
        this.moonIllumination = moonIllumination;
        this.sunrise = sunrise;
        this.moonPhase = moonPhase;
        this.sunset = sunset;
        this.moonrise = moonrise;
    }

    @JsonProperty("moonset")
    public String getMoonset() {
        return moonset;
    }

    @JsonProperty("moonset")
    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    @JsonProperty("moon_illumination")
    public String getMoonIllumination() {
        return moonIllumination;
    }

    @JsonProperty("moon_illumination")
    public void setMoonIllumination(String moonIllumination) {
        this.moonIllumination = moonIllumination;
    }

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("moon_phase")
    public String getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moon_phase")
    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("moonrise")
    public String getMoonrise() {
        return moonrise;
    }

    @JsonProperty("moonrise")
    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Astro withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("moonset", moonset).append("moonIllumination", moonIllumination).append("sunrise", sunrise).append("moonPhase", moonPhase).append("sunset", sunset).append("moonrise", moonrise).append("additionalProperties", additionalProperties).toString();
    }
}