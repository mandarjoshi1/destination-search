package com.destination.serach.helper;

import com.destination.serach.model.SearchResult;
import com.destination.serach.model.foursquare.Feature;
import com.destination.serach.model.foursquare.FoursquareVenuesResponse;
import com.destination.serach.model.foursquare.Venue;
import com.destination.serach.model.geocode.Location;
import com.destination.serach.model.geocode.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class HelperFunctions {

    public static Function<Result, SearchResult> geocodeResultToSearchResult = new Function<Result, SearchResult>() {
        @Override
        public SearchResult apply(Result geocodeResult) {
            SearchResult searchResult = new SearchResult();
            searchResult.setAddress(geocodeResult.getFormattedAddress());
            searchResult.setLocation(geocodeResult.getGeometry().getLocation());
            return searchResult;
        }
    };
}
