package com.shilin.springcloud.service;

import com.shilin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author shilin
 * @create 2020-09-22 19:21
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
