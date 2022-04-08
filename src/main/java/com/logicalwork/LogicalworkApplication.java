package com.logicalwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogicalworkApplication {

	@GetMapping("/")
	public String message() {
		return "Al habibi Welocme to Dubai";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LogicalworkApplication.class, args);
	}

}
