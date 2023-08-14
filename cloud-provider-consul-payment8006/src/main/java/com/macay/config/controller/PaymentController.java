package com.macay.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;



import java.util.UUID;

/**
 * @ClassName: PaymentController
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/28 5:59 下午
 */

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")        //获取端口号
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentzk(){
        return "springcloud with consul：" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
