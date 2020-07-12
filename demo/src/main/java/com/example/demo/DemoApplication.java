package com.example.demo;

import com.example.demo.domain.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private final UserService userService;

	@Autowired
	public DemoApplication(UserService userService) {
		this.userService = userService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(DemoApplication.class.getName() + " started !!");
		
		this.userService.create();

		log.info(DemoApplication.class.getName() + " ended !!");
	}

}
