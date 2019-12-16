package com.example.convertcurrency.controller;

import com.example.convertcurrency.model.CurrencyConversionBean;
import com.example.convertcurrency.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {
    @Autowired
    CurrencyConversionService currencyConversionService;

    @GetMapping("/api/currency/convert/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable Float quantity) {

         String totalCalculatedAmount = this.currencyConversionService.conversion(from, to, quantity);
         CurrencyConversionBean response = new CurrencyConversionBean();
         response.setFrom(from);
         response.setTo(to);
         response.setTotalCalculatedAmount(totalCalculatedAmount);
         return response;

    }

}
