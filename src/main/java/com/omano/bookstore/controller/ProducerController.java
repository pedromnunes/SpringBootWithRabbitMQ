package com.omano.bookstore.controller;

import com.omano.bookstore.domain.Book;
import com.omano.bookstore.domain.BookResponseDTO;
import com.omano.bookstore.message.RabbitMQSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class ProducerController {
    
    @Autowired
    private RabbitMQSender rabbitMqSender;

    @Value("${app.message}")
    private String message;

    /*
    @PostMapping(value = "book")
    public String publishUserDetails(@RequestBody Book book) {

        rabbitMqSender.send(book);
        return message;
    }
    */


    @PostMapping(value = "book")
    public BookResponseDTO publishUserDetails(@RequestBody Book book) {

        rabbitMqSender.send(book);
        return new BookResponseDTO(book, message);
    }

}