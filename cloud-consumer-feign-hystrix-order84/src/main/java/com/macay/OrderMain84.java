package com.macay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderMain80
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/29 9:41 上午
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class OrderMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class);
    }
}
