package com.example.vatcountry.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OutputModel {

    @JsonProperty("CountryCode")
    private String countryCode;


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public OutputModel(String countryCode) {
        this.countryCode = countryCode;
    }

    public OutputModel() {
    }


}
