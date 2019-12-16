package com.example.vatcountry.service;

import com.example.vatcountry.model.InputModel;
import com.example.vatcountry.model.OutputModel;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.web.client.RestTemplate;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(PowerMockRunner.class)
@PrepareForTest(VatCountryService.class)
class VatCountryServiceTest {



    private VatCountryService vatCountryService= new VatCountryService();

    @Test
    void getCodeCountry() throws Exception {

        RestTemplate mockRestTemplate = mock(RestTemplate.class);

        PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(mockRestTemplate);
        ResponseEntity responseEntity = mock(ResponseEntity.class);
        OutputModel outputModel=new OutputModel("FR");
        when(responseEntity.getBody()).thenReturn(outputModel);

        when(mockRestTemplate.exchange(any(String.class),any(HttpMethod.class), Mockito.any( HttpEntity.class ) , Mockito.any( Class.class ))
                ).thenReturn(responseEntity);

        OutputModel actual= vatCountryService.getCodeCountry("FR34");
        assertEquals(outputModel.getCountryCode(),actual.getCountryCode());

    }

}
