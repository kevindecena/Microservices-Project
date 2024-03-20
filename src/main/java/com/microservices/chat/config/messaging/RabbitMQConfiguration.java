package com.microservices.chat.config.messaging;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMQConfiguration {

    @Bean
    HeadersExchange exchange(@Value("{spring.rabbitmq.exchange}") String exchange){
        return new HeadersExchange(exchange);
    }

    @Bean
    Queue queue(@Value("{spring.rabbit.mq.queue}") String queue){
        return new Queue(queue);
    }

    @Bean
    Binding productCalculatorBinding(@Qualifier("queue") Queue queue,
                                      @Qualifier("queue") Queue queue,
                                      @Value("{spring.rabbitmq.filters.saStatus}") String saStatusFilter) {
        return buildBindings(queue, exchange, saStatusFilter);
    }

    private Binding buildBindings(Queue queue, HeadersExchange exchange, String headerValue){
        return BindingBuilder.bind(queue)
                .to(exchange)
                .where("notificationClass")
                .matches(headerValue);
    }


}
