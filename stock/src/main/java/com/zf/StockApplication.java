package com.zf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 张子锋
 * @Date: 2023/5/1 12:30
 * @Description:
 */
@SpringBootApplication
public class StockApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(StockApplication.class);
        springApplication.run(args);
    }
}
