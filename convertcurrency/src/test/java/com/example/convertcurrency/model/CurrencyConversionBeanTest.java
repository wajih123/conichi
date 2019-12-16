package com.example.convertcurrency.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConversionBeanTest {


    CurrencyConversionBean currencyConversionBean;
    @BeforeEach
    public void setUp() {
        currencyConversionBean = new CurrencyConversionBean();
    }
    @Test
    void getFrom() {
        String usd = "USD";
        currencyConversionBean.setFrom(usd);
        assertEquals(usd, currencyConversionBean.getFrom());
    }

    @Test
    void getTo() {
        String eur = "EUR";
        currencyConversionBean.setTo(eur);
        assertEquals(eur, currencyConversionBean.getTo());
    }

    @Test
    void getTotalCalculatedAmount() {
        String amount = "20";
        currencyConversionBean.setTotalCalculatedAmount(amount);
        assertEquals(amount, currencyConversionBean.getTotalCalculatedAmount());
    }

}
