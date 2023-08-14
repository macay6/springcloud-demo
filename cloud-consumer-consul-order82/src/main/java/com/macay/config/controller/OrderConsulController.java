package com.macay.config.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;

/**
 * @ClassName: PaymentController
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/28 5:59 下午
 */

@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL = "http://cloud-provider-consul-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}
