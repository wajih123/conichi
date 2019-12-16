package com.clientui.proxy;

import com.clientui.beans.OutputModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-vatCountry", url = "localhost:9004")
public interface MicroServiceVatCountryProxy {

    @GetMapping("/api/vatCode/{vatCode}")
    public OutputModel GetCountryCode(@PathVariable String vatCode);
}
