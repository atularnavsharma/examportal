package com.exam.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AppController {
	
	@GetMapping("/home")
	public String goHome() {
		return "Go to App";
	}
		
	@GetMapping("/admin")
	public String admin() {
		return "I'm Admin";
	}

}
