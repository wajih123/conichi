package com.example.vatcountry.service;

import com.example.vatcountry.model.InputModel;
import com.example.vatcountry.model.OutputModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;

@Component
public class VatCountryService {

   public OutputModel getCodeCountry( String vatNumber) {
       RestTemplate restTemplate = new RestTemplate();
       String resourceUrl = "http://api.cloudmersive.com/validate/vat/lookup";
       HttpHeaders headers = new HttpHeaders();
       headers.set("Apikey", "28e63794-ef8a-4616-80bb-26fdd3709a19");
       HttpEntity<InputModel> request = new HttpEntity<>(new InputModel(vatNumber) ,headers);
       ResponseEntity<OutputModel> response = restTemplate
               .exchange(resourceUrl, HttpMethod.POST, request, OutputModel.class);
       OutputModel outputModel = response.getBody();
       return outputModel;
        }

    }


