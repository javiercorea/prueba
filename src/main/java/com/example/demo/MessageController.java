package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private MessageSender messageSender;

    @GetMapping("/send")
    public String sendMessage() {
        messageSender.sendMessage("Hola desde Spring Boot!");
        return "Mensaje enviado";
    }
}