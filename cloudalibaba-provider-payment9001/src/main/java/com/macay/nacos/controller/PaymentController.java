package com.macay.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PaymentController
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/16 2:40 下午
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos registry, serverPort: " + serverPort + "\t id: " + id;
    }

}
