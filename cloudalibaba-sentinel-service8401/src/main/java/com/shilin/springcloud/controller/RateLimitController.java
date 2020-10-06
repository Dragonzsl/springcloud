package com.shilin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.shilin.springcloud.entities.CommonResult;
import com.shilin.springcloud.entities.Payment;
import com.shilin.springcloud.handler.MyHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shilin
 * @create 2020-10-06 11:10
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult<Payment> byResource() {
        return  new CommonResult<>(200,"按照资源名称限流测试",new Payment(2020L,"serial001"));
    }

    public CommonResult<Payment> handleException(BlockException exception) {
        return  new CommonResult<>(444,exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = MyHandler.class,
            blockHandler = "blockHandlerException2")
    public CommonResult<Payment> customerBlockHandler(){
        return new CommonResult<>(200, "按客户自定义",new Payment(2020L, "serial002"));
    }
}
