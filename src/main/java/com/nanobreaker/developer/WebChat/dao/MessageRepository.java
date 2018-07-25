package com.nanobreaker.developer.WebChat.dao;

import com.nanobreaker.developer.WebChat.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface MessageRepository extends JpaRepository<Message, Long> {
}
