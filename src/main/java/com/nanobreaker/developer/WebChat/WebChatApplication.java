package com.nanobreaker.developer.WebChat;

import com.nanobreaker.developer.WebChat.dao.MessageRepository;
import com.nanobreaker.developer.WebChat.dao.UserRepository;
import com.nanobreaker.developer.WebChat.model.Message;
import com.nanobreaker.developer.WebChat.model.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class WebChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebChatApplication.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepository userRepository, MessageRepository messageRepository){
		return args -> {
			User user = new User();
			user.setUserName("Egor");
			userRepository.save(user);

			List<Message> messageList = new ArrayList<>();
			Stream.of("Privet", "Poka", "Ti kto takoi davai do svidania").forEach(text -> {
				Message message = new Message();
				message.setUser(user);
				message.setText(text);
				message.setCreationDate(LocalDate.now());
				messageRepository.saveAndFlush(message);
				messageList.add(message);
			});

			user.setMessageList(messageList);
			userRepository.saveAndFlush(user);

			userRepository.findAll().forEach(user1 -> {
				System.out.println(user1.getUserName());
				user1.getMessageList().forEach(message -> System.out.println(message.getText()));
			});
		};
	}
}
