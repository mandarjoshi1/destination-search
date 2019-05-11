package com.destination.serach.service;

import com.destination.serach.client.FoursquareClient;
import com.destination.serach.client.GeocodeClient;
import com.destination.serach.exception.model.FilterNotFoundException;
import com.destination.serach.helper.CommonHelper;
import com.destination.serach.helper.HelperFunctions;
import com.destination.serach.model.SearchResult;
import com.destination.serach.model.SearchFilters;
import com.destination.serach.model.SearchRequest;
import com.destination.serach.model.foursquare.FoursquareVenuesResponse;
import com.destination.serach.model.geocode.GeocodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    @Autowired
    private GeocodeClient geocodeClient;

    @Autowired
    private FoursquareClient foursquareClient;

    public List<SearchResult> search(SearchRequest request){
        SearchFilters searchFilters = request.getFilters();
        if (searchFilters.isOnlyAreaDetail()) {
            String address = getAddressFromQueryCity(request.getQuery(),request.getCity());
            GeocodeResponse geocodeResponse =  geocodeClient.getGeocodeDetails(address);

            return geocodeResponse.getResults().stream()
                    .map(HelperFunctions.geocodeResultToSearchResult)
                    .collect(Collectors.toList());

        }
        FoursquareVenuesResponse foursquareVenuesResponse = foursquareClient.searchForVenues(request.getCity(), request.getQuery());

        return CommonHelper.foursquareVenuestoSearchResult(foursquareVenuesResponse);
    }

    private String getAddressFromQueryCity(String query, String city){
        return query+ "+" + city ;
    }
}
