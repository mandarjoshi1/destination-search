package com.destination.serach.exception.model;

public class FilterNotFoundException extends RuntimeException {
    public FilterNotFoundException() {
        super("Filters parameter is mandatory");
    }
}
