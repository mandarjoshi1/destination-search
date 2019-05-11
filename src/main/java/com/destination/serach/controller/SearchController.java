package com.destination.serach.controller;

import com.destination.serach.model.geocode.GeocodeResponse;
import com.destination.serach.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public GeocodeResponse search(@RequestParam(value = "query",defaultValue = "") String query){
        return searchService.search(query);
    }
}

