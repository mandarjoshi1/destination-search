package com.destination.serach.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class SearchResponse {
    private Status status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<SearchResult> searchResults;

    public SearchResponse(Status status, List<SearchResult> searchResults) {
        this.status = status;
        this.searchResults = searchResults;
    }

    public SearchResponse() {
    }

    public SearchResponse(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public SearchResponse(Status status, String message, List<SearchResult> searchResults) {
        this.status = status;
        this.message = message;
        this.searchResults = searchResults;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }
}
