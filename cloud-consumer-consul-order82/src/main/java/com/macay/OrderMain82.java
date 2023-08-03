package com.macay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain8001
 * @Description:
 * @Author: Macay
 * @Date: 2023/7/30 12:10 下午
 */
@SpringBootApplication
@EnableDiscoveryClient	//该注解用于向使用consul或者Zookeeper作为注册中心时注册服务
public class OrderMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain82.class);
    }
}
