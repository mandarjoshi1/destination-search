package com.destination.serach.exception.model;

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException() {
        super("City is mandatory field");
    }
}
