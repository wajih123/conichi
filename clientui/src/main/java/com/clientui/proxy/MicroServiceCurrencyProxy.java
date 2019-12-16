package com.clientui.proxy;

import com.clientui.beans.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-convertCurrency", url = "localhost:9003")
public interface MicroServiceCurrencyProxy {

    @GetMapping("/api/currency/convert/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable Float quantity);
}
