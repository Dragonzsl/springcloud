package com.shilin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shilin
 * @create 2020-10-02 17:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaOrderNacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaOrderNacosMain83.class, args);
    }
}
