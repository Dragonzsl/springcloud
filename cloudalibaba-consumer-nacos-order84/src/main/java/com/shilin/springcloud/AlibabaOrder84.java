package com.shilin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shilin
 * @create 2020-10-06 12:45
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AlibabaOrder84 {
    public static void main(String[] args){
        SpringApplication.run(AlibabaOrder84.class,args);
    }
}
