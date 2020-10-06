package com.shilin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shilin
 * @create 2020-10-04 16:32
 */
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
//        int a = 1/0;
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName());
        return "----testB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "*****=>testHotKey<=*****";
    }

    public String deal_testHotKey(String p1, String p2, BlockException e){
        return "*****=>testHotKey<=*****,ε(┬┬﹏┬┬)3";
//        return "*****=>testHotKey<=***** \n" + "ε(┬┬﹏┬┬)3";
    }
}
