package com.shilin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shilin
 * @create 2020-10-06 12:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentMain9003 {
    public static void main(String[] args){
        SpringApplication.run(AlibabaPaymentMain9003.class,args);
    }
}
