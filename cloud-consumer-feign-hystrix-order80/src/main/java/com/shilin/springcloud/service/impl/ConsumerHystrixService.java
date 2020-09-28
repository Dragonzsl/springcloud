package com.shilin.springcloud.service.impl;

import com.shilin.springcloud.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @author shilin
 * @create 2020-09-28 19:31
 */
@Component
public class ConsumerHystrixService implements ConsumerService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
