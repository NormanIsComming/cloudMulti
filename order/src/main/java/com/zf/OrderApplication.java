package com.zf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 张子锋
 * @Date: 2023/5/1 12:28
 * @Description:
 */
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(OrderApplication.class);
        springApplication.run(args);
    }
}
