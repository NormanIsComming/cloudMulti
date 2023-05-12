package com.zf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张子锋
 * @Date: 2023/5/1 12:32
 * @Description:
 */
@RestController
public class StockController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getStock")
    public String getStock(){

        return "stock:" + serverPort;
    }
}
