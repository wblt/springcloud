package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonApplication.class, args);
    }

}
