package com.vijay.Springboot.tutorial.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	public String helloWorld() {
		
		return "Welcome to Spring Boot Vijay";
		
	}

}
