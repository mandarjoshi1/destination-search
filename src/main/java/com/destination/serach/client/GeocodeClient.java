package com.destination.serach.client;

import com.destination.serach.model.geocode.GeocodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

@Component
public class GeocodeClient {
    @Autowired
    private RestOperations restOperations;

    private final String url;

    @Value("${geocode.service.api.key}")
    private String geocodeApiKey;

    public GeocodeClient(@Value("${geocode.service.url}") final String url){
        this.url=url;
    }

    public GeocodeResponse getGeocodeDetails(String query){
        return restOperations.getForObject(url,GeocodeResponse.class,query,geocodeApiKey);
    }
}
