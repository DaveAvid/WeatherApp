package Models;

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
        "date",
        "astro",
        "date_epoch",
        "hour",
        "day"
})
public class Forecastday {

    @JsonProperty("date")
    private String date;
    @JsonProperty("astro")
    private Astro astro;
    @JsonProperty("date_epoch")
    private int dateEpoch;
    @JsonProperty("hour")
    private List<Hour> hour = null;
    @JsonProperty("day")
    private Day day;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Forecastday() {
    }

    /**
     *
     * @param date
     * @param dateEpoch
     * @param astro
     * @param hour
     * @param day
     */
    public Forecastday(String date, Astro astro, int dateEpoch, List<Hour> hour, Day day) {
        super();
        this.date = date;
        this.astro = astro;
        this.dateEpoch = dateEpoch;
        this.hour = hour;
        this.day = day;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Forecastday withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("astro")
    public Astro getAstro() {
        return astro;
    }

    @JsonProperty("astro")
    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public Forecastday withAstro(Astro astro) {
        this.astro = astro;
        return this;
    }

    @JsonProperty("date_epoch")
    public int getDateEpoch() {
        return dateEpoch;
    }

    @JsonProperty("date_epoch")
    public void setDateEpoch(int dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    public Forecastday withDateEpoch(int dateEpoch) {
        this.dateEpoch = dateEpoch;
        return this;
    }

    @JsonProperty("hour")
    public List<Hour> getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }

    public Forecastday withHour(List<Hour> hour) {
        this.hour = hour;
        return this;
    }

    @JsonProperty("day")
    public Day getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Day day) {
        this.day = day;
    }

    public Forecastday withDay(Day day) {
        this.day = day;
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

    public Forecastday withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("date", date).append("astro", astro).append("dateEpoch", dateEpoch).append("hour", hour).append("day", day).append("additionalProperties", additionalProperties).toString();
    }

}