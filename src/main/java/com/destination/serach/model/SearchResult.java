package com.destination.serach.model;

import com.destination.serach.model.foursquare.Venue;
import com.destination.serach.model.geocode.GeocodeResponse;
import com.destination.serach.model.geocode.Location;

import java.util.List;

public class SearchResult {
    private String address;
    private Location location;
    private List<Venue> venues;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }
}
