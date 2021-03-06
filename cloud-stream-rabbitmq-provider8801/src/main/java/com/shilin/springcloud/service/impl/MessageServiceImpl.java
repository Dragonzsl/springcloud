package com.shilin.springcloud.service.impl;

import com.shilin.springcloud.service.IMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author shilin
 * @create 2020-10-01 10:31
 */
@EnableBinding(Source.class) //定义消息的推送管道
@Slf4j
public class MessageServiceImpl implements IMessageService {

    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("******serial: " + serial);
        return null;
    }
}
