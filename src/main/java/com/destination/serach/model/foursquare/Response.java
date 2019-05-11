
package com.destination.serach.model.foursquare;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "venues",
    "geocode"
})
public class Response {

    @JsonProperty("venues")
    private List<Venue> venues = null;
    @JsonProperty("geocode")
    private Geocode geocode;

    @JsonProperty("venues")
    public List<Venue> getVenues() {
        return venues;
    }

    @JsonProperty("venues")
    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    @JsonProperty("geocode")
    public Geocode getGeocode() {
        return geocode;
    }

    @JsonProperty("geocode")
    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

}
