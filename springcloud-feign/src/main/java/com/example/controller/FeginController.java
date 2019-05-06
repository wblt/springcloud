package com.example.controller;


import com.example.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {

    @Autowired
    private FeginService feginService;

    @GetMapping("/fegin")
    public String fegin() {
        return feginService.hello();
    }

}
