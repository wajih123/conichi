package com.example.vatcountry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VatcountryApplication {

    public static void main(String[] args) {
        SpringApplication.run(VatcountryApplication.class, args);
    }

}
