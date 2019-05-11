package com.destination.serach.service;

import com.destination.serach.client.GeocodeClient;
import com.destination.serach.model.geocode.GeocodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    private GeocodeClient geocodeClient;

    public GeocodeResponse search(String query){
        return geocodeClient.getGeocodeDetails(query);
    }
}
