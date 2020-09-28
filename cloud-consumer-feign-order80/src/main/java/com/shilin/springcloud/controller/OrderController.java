package com.shilin.springcloud.controller;

import com.shilin.springcloud.entities.CommonResult;
import com.shilin.springcloud.entities.Payment;
import com.shilin.springcloud.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-09-28 12:07
 */
@RestController
public class OrderController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return consumerService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return consumerService.paymentFeignTimeout();
    }
}
