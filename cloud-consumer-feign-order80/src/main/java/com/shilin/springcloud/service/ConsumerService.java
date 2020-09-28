package com.shilin.springcloud.service;

import com.shilin.springcloud.entities.CommonResult;
import com.shilin.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shilin
 * @create 2020-09-28 12:05
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface ConsumerService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
