package com.example.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableMongoRepositories("com.example.data")
public class SpringBootHelloWorld1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorld1Application.class, args);
	}
}
