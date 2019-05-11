package com.destination.serach.helper;

import com.destination.serach.model.Result;
import com.destination.serach.model.SearchResponse;
import com.destination.serach.model.Status;
import com.destination.serach.model.geocode.GeocodeResponse;

public class ResponseHelper {
    public static SearchResponse getSearchResponse(Status status, GeocodeResponse geocodeResponse){
        return new SearchResponse(Status.OK,new Result(geocodeResponse));
    }
}
