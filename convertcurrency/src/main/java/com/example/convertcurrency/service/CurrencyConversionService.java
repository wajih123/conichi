package com.example.convertcurrency.service;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Component
public class CurrencyConversionService {

    public String conversion(String from, String to, double quantity) {
        double amount = 0;
        DecimalFormat f = new DecimalFormat("##.##");

        if (from.trim().toUpperCase().equals("USD")) {
            if (to.trim().toUpperCase().equals("EUR") ) {
                amount = quantity * 0.87;
            }
            if (to == "GBP") {
                amount = quantity * 0.78;
            }
            if (to == "JPY") {
                amount = quantity * 111.087;
            }
            if (to == "INR") {
                amount = quantity * 70.15;
            }
            if (to == "TND") {
                amount = quantity * 2.7;
            }
        }
            if (from == "EUR") {
                if (to == "USD") {
                    amount = quantity * 1.11;
                }
                if (to == "GBP") {
                    amount = quantity * 0.90;
                }
                if (to == "JPY") {
                    amount = quantity * 127.32;
                }
                if (to == "INR") {
                    amount = quantity * 80.5;
                }
                if (to == "TND") {
                    amount = quantity * 3.1;
                }
            }
            if (from == "GBP") {
                if (to == "EUR") {
                    amount = quantity * 1.10;
                }
                if (to == "USD") {
                    amount = quantity * 1.26;
                }
                if (to == "JPY") {
                    amount = quantity * 140.93;
                }
                if (to == "INR") {
                    amount = quantity * 88.75;
                }
                if (to == "TND") {
                    amount = quantity * 3.78;
                }
            }
        if (from == "JPY") {
            if (to == "EUR") {
                amount = quantity * 0.007;
            }
            if (to == "USD") {
                amount = quantity * 0.008;
            }
            if (to == "GBP") {
                amount = quantity * 0.007;
            }
            if (to == "INR") {
                amount = quantity * 0.63;
            }
            if (to == "TND") {
                amount = quantity * 0.026;
            }
        }
        if (from == "INR") {
            if (to == "EUR") {
                amount = quantity * 80.25;
            }
            if (to == "USD") {
                amount = quantity * 70.5;
            }
            if (to == "GBP") {
                amount = quantity * 88.17;
            }
            if (to == "JPY") {
                amount = quantity * 0.63;
            }
            if (to == "TND") {
                amount = quantity * 0.040;
            }
        }
        if (from == "TND") {
            if (to == "EUR") {
                amount = quantity / 3.1;
            }
            if (to == "USD") {
                amount = quantity / 2.7;
            }
            if (to == "GBP") {
                amount = quantity / 3.78;
            }
            if (to == "JPY") {
                amount = quantity / 0.026;
            }
            if (to == "INR") {
                amount = quantity / 0.040;
            }
        }
        return f.format(amount);
            }
        }


