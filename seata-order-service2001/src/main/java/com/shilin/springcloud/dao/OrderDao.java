package com.shilin.springcloud.dao;

import com.shilin.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shilin
 * @create 2020-10-07 10:27
 */
@Mapper
public interface OrderDao {

    //创建订单
    void create(Order order);

    //更新订单状态
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
