package com.example.demo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
	@RabbitListener(queues = "prueba1")
    public void receiveMessage(String message) {
        System.out.println("Mensaje recibido: acac no" + message);
    }
}
