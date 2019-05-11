package com.destination.serach.controller.v1;

import com.destination.serach.exception.model.QueryNotFoundException;
import com.destination.serach.helper.CommonHelper;
import com.destination.serach.model.SearchRequest;
import com.destination.serach.model.SearchResponse;
import com.destination.serach.model.SearchResult;
import com.destination.serach.model.Status;
import com.destination.serach.service.SearchService;
import com.destination.serach.validator.SearchRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "/search", headers = "X-API-VERSION=1")
    public SearchResponse search(@RequestBody SearchRequest request){
       if(!SearchRequestValidator.validate(request)){
           throw new QueryNotFoundException();
       }
        List<SearchResult> searchResults = searchService.search(request);
        return CommonHelper.getSearchResponse(Status.OK,searchResults);
    }
}

