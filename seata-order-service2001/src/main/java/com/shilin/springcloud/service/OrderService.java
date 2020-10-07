package com.shilin.springcloud.service;

import com.shilin.springcloud.domain.Order;

/**
 * @author shilin
 * @create 2020-10-07 11:06
 */
public interface OrderService {
    //创建订单
    void create(Order order);
}
