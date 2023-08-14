package com.macay.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: GateWayConfig
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/14 11:16 上午
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_frx01",
                r -> r.path("/csdn")
                        .uri("https://blog.csdn.net")).build();
        return routes.build();
    }
}
