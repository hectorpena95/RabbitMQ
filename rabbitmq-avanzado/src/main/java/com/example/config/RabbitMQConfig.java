package com.example.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "orders.queue";

    @Bean
    public Queue ordersQueue() {
        // durable: true para que la cola sobreviva a reinicios de RabbitMQ
        return new Queue(QUEUE_NAME, true);
    }
}