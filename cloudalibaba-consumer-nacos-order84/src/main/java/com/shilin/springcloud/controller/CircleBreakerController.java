package com.shilin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.shilin.springcloud.entities.CommonResult;
import com.shilin.springcloud.entities.Payment;
import com.shilin.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-10-06 15:07
 */
@RestController
public class CircleBreakerController {

    public static final String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @GetMapping("/consumer/fallback/{id}")
    @SentinelResource(value = "fallback", fallback = "fallbackHandler", blockHandler = "blockHandler")
    public CommonResult<Payment> fallback(@PathVariable("id") Long id) {
        CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, CommonResult.class, id);
        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgument ,非法参数异常...");
        } else {
            assert result != null;
            if (result.getData() == null) {
                throw new NullPointerException("NullPointerException,该ID没有对应记录，空指针异常");
            }
        }
        return result;
    }

    public CommonResult<Payment> fallbackHandler(Long id, Throwable e) {
        return new CommonResult<>(444, e.getMessage(),
                new Payment(id, "serial_" + id));
    }

    public CommonResult<Payment> blockHandler(Long id) {
        return new CommonResult<>(445, "blockHandler-sentinel 限流",
                new Payment(id, "serial_" + id));
    }

    @Resource
    private OrderService orderService;

    @GetMapping("/consumer/paymentSQL/{id}")
    CommonResult<Payment> order(@PathVariable("id") Long id) {
        return orderService.order(id);
    }

    ;
}
