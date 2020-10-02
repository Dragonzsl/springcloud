package com.shilin.springcloud.controller;

import com.shilin.springcloud.service.IMessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-10-01 10:42
 */
@RestController
public class MessageController {

    @Resource
    private IMessageService messageService;

    @GetMapping("/sendMessage")
    public String send(){
        return messageService.send();
    }
}
