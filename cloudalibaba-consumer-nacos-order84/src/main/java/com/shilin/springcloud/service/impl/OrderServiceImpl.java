package com.shilin.springcloud.service.impl;

import com.shilin.springcloud.entities.CommonResult;
import com.shilin.springcloud.entities.Payment;
import com.shilin.springcloud.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author shilin
 * @create 2020-10-06 16:50
 */
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public CommonResult<Payment> order(Long id) {
        return new CommonResult<>(400, "fallback",new Payment(id, UUID.randomUUID().toString()));
    }
}
