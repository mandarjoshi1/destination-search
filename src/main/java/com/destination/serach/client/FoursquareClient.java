package com.destination.serach.client;

import com.destination.serach.model.foursquare.FoursquareVenuesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

@Component
public class FoursquareClient {
    @Autowired
    private RestOperations restOperations;

    private final String url;

    @Value("${foursquare.client.id}")
    private String foursquareClientId;

    @Value("${foursquare.client.secret}")
    private String foursquareClientSecret;

    @Value("${foursquare.api.version}")
    private String foursquareApiVersion;

    private final String intent="browse";

    public FoursquareClient(@Value("${foursquare.service.url}") final String url){
        this.url=url;
    }

    public FoursquareVenuesResponse searchForVenues(String city, String query){
        return restOperations.getForObject(url,FoursquareVenuesResponse.class,foursquareClientId,foursquareClientSecret,foursquareApiVersion,city,query,intent);
    }


}
