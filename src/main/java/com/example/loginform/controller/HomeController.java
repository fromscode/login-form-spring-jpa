package com.example.loginform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.loginform.model.User;
import com.example.loginform.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository repo;
	
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
	
	@PostMapping("verifyLogin")
	public String verifyLogin(@RequestParam String email, @RequestParam String password) {
		
		return "";
	}
	
	@PostMapping("addUser")
	public String addUser(@ModelAttribute User user, Model m) {
		
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			return "passwordNotMatch";
		}
		
		m.addAttribute("user", repo.save(user));
		return "dashboard";
	}
}
