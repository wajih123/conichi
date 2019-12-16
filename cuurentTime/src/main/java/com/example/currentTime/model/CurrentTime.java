package com.example.currentTime.model;

import java.time.LocalTime;

public class CurrentTime {

    private LocalTime localTime;

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public CurrentTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}
