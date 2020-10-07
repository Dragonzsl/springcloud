package com.shilin.springcloud.service.impl;

import com.shilin.springcloud.dao.OrderDao;
import com.shilin.springcloud.domain.Order;
import com.shilin.springcloud.service.AccountService;
import com.shilin.springcloud.service.OrderService;
import com.shilin.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-10-07 11:07
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说:
     * 下订单->减库存->减余额->改状态
     *
     * @param order 订单
     */
    @Override
    @GlobalTransactional(name = "global_tx",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("===>开始创建订单");
        orderDao.create(order);

        log.info("===>开始减库存");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("===>减库存完成");

        log.info("===>开始减余额");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("===>减余额完成");

        log.info("===>开始改状态");
        orderDao.update(order.getUserId(), 0);
        log.info("===>改状态完成");

        log.info("===>下订单完成");

    }
}
