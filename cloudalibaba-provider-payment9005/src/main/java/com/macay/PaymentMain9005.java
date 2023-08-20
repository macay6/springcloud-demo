package com.macay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain9004
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/20 11:34 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9005 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9005.class,args);
    }
}

