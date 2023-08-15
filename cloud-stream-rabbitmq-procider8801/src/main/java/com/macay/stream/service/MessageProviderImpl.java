package com.macay.stream.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName: MessageProviderImpl
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/15 3:57 下午
 */
@EnableBinding(Source.class)//定义消息发送管道
public class MessageProviderImpl implements IMessageProvider{
    @Resource
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("-------------serial:"+serial);
        return null;
    }
}
