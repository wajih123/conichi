package com.example.vatcountry.controller;

import com.example.vatcountry.model.OutputModel;
import com.example.vatcountry.service.VatCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VatCountryController {

    @Autowired
    VatCountryService vatCountryService;

    @GetMapping("/api/vatCode/{vatCode}")
    public OutputModel GetCountryCode(@PathVariable String vatCode) {

       return this.vatCountryService.getCodeCountry(vatCode);

    }
}
