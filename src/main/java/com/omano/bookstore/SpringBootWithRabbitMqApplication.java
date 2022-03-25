package com.omano.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.omano.bookstore.domain.Book;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootWithRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRabbitMqApplication.class, args);
        System.out.println("The RabbitMQ Producer Application is Running ...");
	}

}
