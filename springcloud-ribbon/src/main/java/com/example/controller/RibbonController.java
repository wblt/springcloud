package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon")
    public String ribbon() {
        String result = restTemplate.getForEntity("http://SPRINGCLOUD-HELLO/hello",String.class).getBody();
        return result;
    }


}
