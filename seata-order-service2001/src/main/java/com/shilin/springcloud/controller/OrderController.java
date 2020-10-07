package com.shilin.springcloud.controller;

import com.shilin.springcloud.domain.CommonResult;
import com.shilin.springcloud.domain.Order;
import com.shilin.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-10-07 11:43
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult<String> create(Order order){
        orderService.create(order);
        return new CommonResult<>(200, "订单创建成功");
    }
}
