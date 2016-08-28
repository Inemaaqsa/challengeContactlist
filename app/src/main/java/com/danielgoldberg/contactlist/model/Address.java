package com.danielgoldberg.contactlist.model;

/**
 * Created by danielgoldberg on 27/8/16.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;
    private double latitude;
    private double longitude;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZip() {
        return zip;
    }
}
