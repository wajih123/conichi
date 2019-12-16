package com.example.convertcurrency.model;

import java.math.BigDecimal;

public class CurrencyConversionBean {

    private String from;
    private String to;
    private String totalCalculatedAmount;

    public CurrencyConversionBean() {

    }

    public CurrencyConversionBean(String from, String to, String totalCalculatedAmount) {

        this.from = from;
        this.to = to;
        this.totalCalculatedAmount = totalCalculatedAmount;
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(String totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }
}
