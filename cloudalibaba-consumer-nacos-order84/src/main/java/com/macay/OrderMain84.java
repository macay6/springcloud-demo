package com.macay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderMain84
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/20 12:38 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class,args);
    }
}
