package com.shilin.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @author shilin
 * @create 2020-09-28 16:03
 */
@Service
public class PaymentService {

    public String paymentInfo_ok(Integer id){
        return "线程池: " + Thread.currentThread().getName() +
                "     paymentInfo_ok,id:  " + id +"O(∩_∩)O";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")  //3秒钟以内就是正常的业务逻辑

    })
    public String paymentInfo_timeout(Integer id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() +
                "     paymentInfo_ok,id:  " + id +"/(ㄒoㄒ)/~~";
    }

    public String paymentInfo_timeoutHandler(Integer id){
        return "线程池: " + Thread.currentThread().getName() +
                "     paymentInfo_ok,id:  " + id +"( *^-^)ρ(*╯^╰)";
    }
}
