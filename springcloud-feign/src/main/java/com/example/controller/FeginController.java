package com.example.controller;


import com.example.pojo.User;
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

    @GetMapping("/fegin2")
    public String fegin2() {
        StringBuilder sb = new StringBuilder();
        sb.append(feginService.hello()).append("\n");
        sb.append(feginService.hello("DIDI")).append("\n");
        sb.append(feginService.hello("DIDI",30)).append("\n");
        sb.append(feginService.hello(new User("DIDI",30))).append("\n");
        return sb.toString();
    }
}
