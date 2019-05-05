package com.example.controller;

import com.example.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService service;

    @GetMapping("/ribbon")
    public String ribbon() {
        return service.ribbonService();
    }
}
