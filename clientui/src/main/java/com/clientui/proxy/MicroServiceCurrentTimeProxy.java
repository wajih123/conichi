package com.clientui.proxy;

import com.clientui.beans.CurrentTime;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalTime;

@FeignClient(name = "microservice-currentTime", url = "localhost:9001")
public interface MicroServiceCurrentTimeProxy {

    @GetMapping(value = "/currentTime")
    public CurrentTime getCurrentTime();
}
