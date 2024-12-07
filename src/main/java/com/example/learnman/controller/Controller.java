package com.example.learnman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.learnman.entity.UsersLogin;
import com.example.learnman.service.UserService;

import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	UserService service;

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		UsersLogin users=new UsersLogin();
		model.addAttribute("registerUser",users);
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registerVal(@ModelAttribute("registerUser") UsersLogin userLogin,Model model,HttpSession session) {
		service.saveData(userLogin);
		session.setAttribute("user", userLogin);
		model.addAttribute("message","Successfully Registered");
		return "redirect:/";
		
		
	}
	
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	
}
