package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;

@SpringBootTest(properties = {
    "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration",
    "spring.rabbitmq.listener.simple.auto-startup=false"
})
class RabbitmqAvanzadoApplicationTests {

    @MockBean
    private ConnectionFactory connectionFactory;

    @Test
    void contextLoads() {
    }

}