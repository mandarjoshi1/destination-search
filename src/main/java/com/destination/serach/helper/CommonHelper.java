package com.destination.serach.helper;

import com.destination.serach.model.SearchFilters;
import com.destination.serach.model.SearchResponse;
import com.destination.serach.model.SearchResult;
import com.destination.serach.model.Status;
import com.destination.serach.model.foursquare.Feature;
import com.destination.serach.model.foursquare.FoursquareVenuesResponse;
import com.destination.serach.model.foursquare.Venue;
import com.destination.serach.model.geocode.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommonHelper {
    public static List<SearchResult> foursquareVenuestoSearchResult(FoursquareVenuesResponse foursquareVenuesResponse, SearchFilters filters) {
        Feature feature = foursquareVenuesResponse.getResponse().getGeocode().getFeature();
        List<Venue> venues = foursquareVenuesResponse.getResponse().getVenues();

        Location location = new Location();
        location.setLat(feature.getGeometry().getCenter().getLat());
        location.setLng(feature.getGeometry().getCenter().getLng());

        if(filters.getCategory() != null && filters.getCategory().trim().length() > 0){
            List filteredVenues = venues.stream()
                    .filter(v -> v.checkCategories(filters.getCategory()))
                    .collect(Collectors.toList());
            venues = filteredVenues;
        }

        SearchResult searchResult = new SearchResult();
        searchResult.setAddress(feature.getDisplayName());
        searchResult.setLocation(location);
        searchResult.setVenues(venues);

        List<SearchResult> searchResults = new ArrayList<>();
        searchResults.add(searchResult);

        return searchResults;
    }
    public static SearchResponse getSearchResponse(Status status, List<SearchResult> searchResults){
        return new SearchResponse(Status.OK,searchResults);
    }
}
