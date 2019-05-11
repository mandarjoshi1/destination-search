package com.destination.serach.exception.model;

public class QueryNotFoundException extends RuntimeException {
    public QueryNotFoundException() {
        super("Query is mandatory field");
    }
}
