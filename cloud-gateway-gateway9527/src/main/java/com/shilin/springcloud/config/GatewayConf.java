package com.shilin.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shilin
 * @create 2020-09-29 17:02
 */
@Configuration
public class GatewayConf {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("route_path_1",
                        r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))
                .route("route_path_2",
                        r -> r.path("/guoji")
                                .uri("http://news.baidu.com/guoji"))
                .build();
    }
}
