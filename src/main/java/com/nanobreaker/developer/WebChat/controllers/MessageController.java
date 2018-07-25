package com.nanobreaker.developer.WebChat.controllers;

import com.nanobreaker.developer.WebChat.dao.MessageRepository;
import com.nanobreaker.developer.WebChat.model.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class MessageController {

    private MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/users-messages")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Message> usersMessages(){
        return new ArrayList<>(messageRepository.findAll());
    }
}
