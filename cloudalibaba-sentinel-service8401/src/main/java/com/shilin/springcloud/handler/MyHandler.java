package com.shilin.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.shilin.springcloud.entities.CommonResult;
import com.shilin.springcloud.entities.Payment;

/**
 * @author shilin
 * @create 2020-10-06 12:04
 */
public class MyHandler {

    public static CommonResult<Payment> blockHandlerException(BlockException e){
        return new CommonResult<>(444, "按照客户自定义的Global 全局异常处理 ---- 1",
                new Payment(2020L, "serial002"));
    }

    public static CommonResult<Payment> blockHandlerException2(BlockException e){
        return new CommonResult<>(444, "按照客户自定义的Global 全局异常处理 ---- 2",
                new Payment(2020L, "serial002"));
    }
}
