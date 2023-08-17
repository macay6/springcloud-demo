package com.macay.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderNacosMain90
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/16 3:05 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain90 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain90.class, args);
    }
}
