package com.shilin.springcloud.service;

import com.shilin.springcloud.entities.CommonResult;
import com.shilin.springcloud.entities.Payment;
import com.shilin.springcloud.service.impl.OrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shilin
 * @create 2020-10-06 16:43
 */
@FeignClient(value = "nacos-payment-provider",fallback = OrderServiceImpl.class)
public interface OrderService {

    @GetMapping("/paymentSQL/{id}")
    CommonResult<Payment> order(@PathVariable("id") Long id);
}
