package com.shilin.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-09-25 09:53
 */
@RestController
@Slf4j
public class ConsumerController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        return restTemplate.getForObject(INVOKE_URL +"/payment/zk",String.class);
    }
}
