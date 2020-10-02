package com.shilin.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author shilin
 * @create 2020-10-01 11:40
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessage {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void receiveMessage(Message<String > message){
        log.info("消费者2号， -----> 接受到的消息：" + message.getPayload());
        log.info("port: " + serverPort);
    }
}
