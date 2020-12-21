package com.example.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class Assessment1Application {

	private static final String MESSAGE_QUEUE = "products_queue";
	
	public static void main(String[] args) {
		SpringApplication.run(Assessment1Application.class, args);
		
	}

}
