package com.gs.poc.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class POCService {

    public String testRestTemplate()
    {

        String url = "https://postman-echo.com/get?test=123";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> res =  restTemplate.getForEntity(url,String.class);




        System.out.println("res -----> "+res);

        return "success";
    }
}
