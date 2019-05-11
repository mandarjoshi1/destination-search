package com.destination.serach.validator;

import com.destination.serach.exception.model.CityNotFoundException;
import com.destination.serach.exception.model.FilterNotFoundException;
import com.destination.serach.exception.model.QueryNotFoundException;
import com.destination.serach.model.SearchRequest;

public class SearchRequestValidator {
    public static void validate(SearchRequest searchRequest){
        if(searchRequest.getQuery() == null || searchRequest.getQuery().trim().length() <= 0){
            throw new QueryNotFoundException();
        }
        if(searchRequest.getCity() == null || searchRequest.getCity().trim().length() <= 0){
            throw new CityNotFoundException();
        }
        if(searchRequest.getFilters() == null){
            throw new FilterNotFoundException();
        }
    }
}
