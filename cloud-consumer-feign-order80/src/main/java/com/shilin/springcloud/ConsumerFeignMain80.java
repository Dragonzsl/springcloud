package com.shilin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shilin
 * @create 2020-09-28 12:03
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain80.class, args);
    }
}
