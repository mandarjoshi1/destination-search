package com.destination.serach.exception.model;

public class QueryNotFoundException extends RuntimeException {
    public QueryNotFoundException() {
        super("Query not found, it's a required field");
    }
}
