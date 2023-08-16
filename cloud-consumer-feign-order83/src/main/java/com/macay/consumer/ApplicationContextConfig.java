package com.macay.consumer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/29 10:12 上午
 */
@Configuration
public class ApplicationContextConfig {

    //@Bean相当于applicationContext.xml <bean id="" class=""/>
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
