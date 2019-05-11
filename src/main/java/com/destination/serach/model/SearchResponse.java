package com.destination.serach.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class SearchResponse {
    private Status status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Result result;

    public SearchResponse(Status status, Result result) {
        this.status = status;
        this.result = result;
    }

    public SearchResponse() {
    }

    public SearchResponse(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public SearchResponse(Status status, String message, Result result) {
        this.status = status;
        this.message = message;
        this.result = result;
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

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
