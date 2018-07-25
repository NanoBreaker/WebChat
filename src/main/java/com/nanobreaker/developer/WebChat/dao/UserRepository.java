package com.nanobreaker.developer.WebChat.dao;

import com.nanobreaker.developer.WebChat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
}
