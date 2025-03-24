package com.example.loginform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("signup")
	public String signUpPage() {
		return "signup";
	}
	
	@GetMapping("forgotPassword")
	public String forgotPasswordPage() {
		return "forgotPassword";
	}
}
