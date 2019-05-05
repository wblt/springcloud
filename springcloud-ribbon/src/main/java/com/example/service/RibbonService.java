package com.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "ribbonFallback")
    public String ribbonService() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = restTemplate.getForEntity("http://SPRINGCLOUD-HELLO/hello",String.class).getBody();
        return result;
    }

    public String ribbonFallback() {
        return "error";
    }

}
