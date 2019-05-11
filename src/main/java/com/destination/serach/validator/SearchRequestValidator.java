package com.destination.serach.validator;

import com.destination.serach.model.SearchRequest;

public class SearchRequestValidator {
    public static boolean validate(SearchRequest searchRequest){
        return searchRequest.getQuery().trim().length() > 0;
    }
}
