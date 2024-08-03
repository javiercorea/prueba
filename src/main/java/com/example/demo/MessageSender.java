package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue que;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(que.getName(), message);
        System.out.println("Mensaje enviado: jco " + message);
    }
}