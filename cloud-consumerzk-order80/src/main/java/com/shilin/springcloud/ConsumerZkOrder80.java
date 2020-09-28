package com.shilin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shilin
 * @create 2020-09-25 09:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZkOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZkOrder80.class, args);
    }
}
