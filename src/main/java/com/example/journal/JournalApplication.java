package com.example.journal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JournalApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JournalApplication.class, args);
		Dev dev = context.getBean(Dev.class);
		dev.build();
	}
}
