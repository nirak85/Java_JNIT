package com.spboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hello {

	public static void main(String[] args) {
		SpringApplication.run(Hello.class, args);
		System.out.println("Spring Boot Application");
	}

}
