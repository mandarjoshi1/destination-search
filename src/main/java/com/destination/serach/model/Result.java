package com.destination.serach.model;

import com.destination.serach.model.geocode.GeocodeResponse;

public class Result {
    private GeocodeResponse geocodeResponse;

    public Result(GeocodeResponse geocodeResponse) {
        this.geocodeResponse = geocodeResponse;
    }

    public GeocodeResponse getGeocodeResponse() {
        return geocodeResponse;
    }

    public void setGeocodeResponse(GeocodeResponse geocodeResponse) {
        this.geocodeResponse = geocodeResponse;
    }
}
