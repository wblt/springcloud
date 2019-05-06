package com.example.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRINGCLOUD-HELLO")
public interface FeginService {

    @GetMapping("/hello")
    String hello();
}
