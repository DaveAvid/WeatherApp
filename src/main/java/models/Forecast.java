package models;

import java.util.HashMap;
import java.util.List;
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
        "forecastday"
})
public class Forecast {

    @JsonProperty("forecastday")
    private List<Forecastday> forecastday = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Forecast() {
    }

    /**
     *
     * @param forecastday
     */
    public Forecast(List<Forecastday> forecastday) {
        super();
        this.forecastday = forecastday;
    }

    @JsonProperty("forecastday")
    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    @JsonProperty("forecastday")
    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    public Forecast withForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
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

    public Forecast withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("forecastday", forecastday).append("additionalProperties", additionalProperties).toString();
    }

}