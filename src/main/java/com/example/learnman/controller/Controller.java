package com.example.learnman.controller;

import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	
}
