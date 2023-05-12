package com.zf.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 张子锋
 * @Date: 2023/5/1 15:13
 * @Description:
 */
@Configuration
public class OrderConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
