package com.shilin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shilin
 * @create 2020-09-25 10:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsulPaymentMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulPaymentMain8006.class, args);
    }
}
