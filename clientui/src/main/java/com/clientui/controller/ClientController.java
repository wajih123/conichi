package com.clientui.controller;

import com.clientui.beans.CurrencyConversionBean;
import com.clientui.beans.CurrentTime;
import com.clientui.beans.OutputModel;
import com.clientui.proxy.MicroServiceCurrencyProxy;
import com.clientui.proxy.MicroServiceCurrentTimeProxy;
import com.clientui.proxy.MicroServiceVatCountryProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;


@Controller
public class ClientController {

    @Autowired
    private MicroServiceCurrentTimeProxy microServiceCurrentTimeProxy;

    @Autowired
    private MicroServiceCurrencyProxy microServiceCurrencyProxy;

    @Autowired
    private MicroServiceVatCountryProxy microServiceVatCountryProxy;

    @RequestMapping("/currentTime")
    public String accueil(Model model){
        CurrentTime currentTime = microServiceCurrentTimeProxy.getCurrentTime();
        model.addAttribute("currentTime", currentTime.getLocalTime());
        return "Accueil";
    }

    @RequestMapping("/api/currency/convert/from/{from}/to/{to}/quantity/{quantity}")
    public String currencyConvert(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable Float quantity, Model model){

        CurrencyConversionBean currencyConversion = microServiceCurrencyProxy.convertCurrency(from, to, quantity);
        model.addAttribute("From",currencyConversion.getFrom());
        model.addAttribute("To",currencyConversion.getTo());
        model.addAttribute("TotalAmount",currencyConversion.getTotalCalculatedAmount());

        return "CurrencyConvert";

    }

    @GetMapping("/api/vatCode/{vatCode}")
    public String GetCountryCode(@PathVariable String vatCode, Model model){

          OutputModel outputModelBean = microServiceVatCountryProxy.GetCountryCode(vatCode);
          model.addAttribute("countryCode", outputModelBean.getCountryCode());

          return "VatCountry";
    }

}
