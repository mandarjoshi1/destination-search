package com.destination.serach.controller;

import com.destination.serach.helper.ResponseHelper;
import com.destination.serach.model.SearchRequest;
import com.destination.serach.model.SearchResponse;
import com.destination.serach.model.Status;
import com.destination.serach.model.geocode.GeocodeResponse;
import com.destination.serach.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public SearchResponse search(@RequestBody SearchRequest request){
        GeocodeResponse geocodeResponse = searchService.search(request.getQuery());
        return ResponseHelper.getSearchResponse(Status.OK,geocodeResponse);
    }
}

