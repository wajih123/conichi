package com.example.currentTime.controller;

import com.example.currentTime.model.CurrentTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class CurrentTimeController {

    @GetMapping(value = "/currentTime")
     public CurrentTime getCurrentTime(){
        LocalTime localTime = LocalTime.now();
        CurrentTime currentTime = new CurrentTime(localTime);
            return currentTime;
    }
}
