package com.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RibbonConfig {
    /**
     * 实例化ribbon使用的RestTemplate
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate rebbionRestTemplate(){
        return new RestTemplate();
    }
}
