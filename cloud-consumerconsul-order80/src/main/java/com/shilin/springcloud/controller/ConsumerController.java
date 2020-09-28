package com.shilin.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-09-25 11:02
 */
@RestController
public class ConsumerController {
    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment (){
        return restTemplate.getForObject(INVOKE_URL +"/payment/consul",String.class);
    }
}
