package com.example.convertcurrency.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConversionServiceTest {

    private CurrencyConversionService currencyConversionService = new CurrencyConversionService();

    private static final String  EUR="EUR";
    private static final String USD ="USD";
    private static final String GBP="GBP";
    private static final String JPY="JPY";
    private static final String INR="INR";
    private static final String TND="TND";

    @Test
    void convertUSDToEUR() {
        final String actual =currencyConversionService.conversion(USD,EUR,100);
        final String expected ="87";
        assertEquals(expected,actual);
    }

    @Test
    void convertUSDToGBP() {
        final String actual =currencyConversionService.conversion(USD,GBP,100);
        final String expected ="78";
        assertEquals(expected,actual);
    }

    @Test
    void convertUSDToJPY() {
        final String actual =currencyConversionService.conversion(USD,JPY,100);
        final String expected ="11108,7";
        assertEquals(expected,actual);
    }

    @Test
    void convertUSDToINR() {
        final String actual =currencyConversionService.conversion(USD,INR,100);
        final String expected ="7015";
        assertEquals(expected,actual);
    }

    @Test
    void convertUSDToTND() {
        final String actual =currencyConversionService.conversion(USD,TND,100);
        final String expected ="270";
        assertEquals(expected,actual);
    }

    @Test
    void convertEURToUSD() {
        final String actual =currencyConversionService.conversion(EUR,USD,100);
        final String expected ="111";
        assertEquals(expected,actual);
    }

    @Test
    void convertEURToGBP() {
        final String actual =currencyConversionService.conversion(EUR,GBP,100);
        final String expected ="90";
        assertEquals(expected,actual);
    }

    @Test
    void convertEURToJPY() {
        final String actual =currencyConversionService.conversion(EUR,JPY,100);
        final String expected ="12732";
        assertEquals(expected,actual);
    }

    @Test
    void convertEURToINR() {
        final String actual =currencyConversionService.conversion(EUR,INR,100);
        final String expected ="8050";
        assertEquals(expected,actual);
    }

    @Test
    void convertEURToTND() {
        final String actual =currencyConversionService.conversion(EUR,TND,100);
        final String expected ="310";
        assertEquals(expected,actual);
    }

    @Test
    void convertGBPToUSD() {
        final String actual =currencyConversionService.conversion(GBP,USD,100);
        final String expected ="126";
        assertEquals(expected,actual);
    }

    @Test
    void convertGBPToEUR() {
        final String actual =currencyConversionService.conversion(GBP,EUR,100);
        final String expected ="110";
        assertEquals(expected,actual);
    }

    @Test
    void convertGBPToJPY() {
        final String actual =currencyConversionService.conversion(GBP,JPY,100);
        final String expected ="14093";
        assertEquals(expected,actual);
    }

    @Test
    void convertGBPToINR() {
        final String actual =currencyConversionService.conversion(GBP,INR,100);
        final String expected ="8875";
        assertEquals(expected,actual);
    }

    @Test
    void convertGBPToTND() {
        final String actual =currencyConversionService.conversion(GBP,TND,100);
        final String expected ="378";
        assertEquals(expected,actual);
    }

    @Test
    void convertJPYToUSD() {
        final String actual =currencyConversionService.conversion(JPY,USD,100);
        final String expected ="0,8";
        assertEquals(expected,actual);
    }

    @Test
    void convertJPYToEUR() {
        final String actual =currencyConversionService.conversion(JPY,EUR,100);
        final String expected ="0,7";
        assertEquals(expected,actual);
    }

    @Test
    void convertJPYToGBP() {
        final String actual =currencyConversionService.conversion(JPY,GBP,100);
        final String expected ="0,7";
        assertEquals(expected,actual);
    }

    @Test
    void convertJPYToINR() {
        final String actual =currencyConversionService.conversion(JPY,INR,100);
        final String expected ="63";
        assertEquals(expected,actual);
    }

    @Test
    void convertJPYToTND() {
        final String actual =currencyConversionService.conversion(JPY,TND,100);
        final String expected ="2,6";
        assertEquals(expected,actual);
    }

    @Test
    void convertTNDToUSD() {
        final String actual =currencyConversionService.conversion(TND,USD,100);
        final String expected ="37,04";
        assertEquals(expected,actual);
    }

    @Test
    void convertTNDToEUR() {
        final String actual =currencyConversionService.conversion(TND,EUR,100);
        final String expected ="32,26";
        assertEquals(expected,actual);
    }

    @Test
    void convertTNDToGBP() {
        final String actual =currencyConversionService.conversion(TND,GBP,100);
        final String expected ="26,46";
        assertEquals(expected,actual);
    }

    @Test
    void convertTNDToINR() {
        final String actual =currencyConversionService.conversion(TND,INR,100);
        final String expected ="2500";
        assertEquals(expected,actual);
    }

    @Test
    void convertTNDToJPY() {
        final String actual =currencyConversionService.conversion(TND,JPY,100);
        final String expected ="3846,15";
        assertEquals(expected,actual);
    }

}
