package com.example.loginform.controller;

import java.util.Optional;

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
	public String verifyLogin(@RequestParam String email, @RequestParam String password, Model m) {
		User user = repo.getReferenceById(email);
		
		if(user.getPassword().equals(password)) {
			m.addAttribute("user", user);
			return "dashboard";
		}
		return "failure";
	}
	
	@PostMapping("addUser")
	public String addUser(@ModelAttribute User user, Model m) {
		
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			return "passwordNotMatch";
		}
		
		m.addAttribute("user", repo.save(user));
		return "dashboard";
	}
	
	@PostMapping("verifyEmail")
	public String verifyEmail(@RequestParam String email, Model m) {
		
		Optional<User> optionalUser = repo.findById(email);
		
		if (optionalUser.isPresent()) {
			m.addAttribute("user", optionalUser.get());
			return "securityQuestion";
		}
		
		return "userNotFound";
	}
	
	@PostMapping("verifyAnswer")
	public String verifyAnswer(@RequestParam String answer, @RequestParam String email, Model m) {
		
		User user = (User) repo.getReferenceById(email);
		System.out.println(user.toString());
		
		if (user.getSecurityAnswer().equals(answer)) {
			m.addAttribute("user", user);
			return "updatePassword";
		}
		
		return "securityAnswerWrong";
	}
	
	@PostMapping("updatePassword")
	public String updatePassword(@RequestParam String password, @RequestParam String confirmPassword, @RequestParam String email, Model m) {
		
		if (!password.equals(confirmPassword)) {
			return "passwordsNotEqual";
		}
		
		User user = (User) repo.getReferenceById(email);
		
		user.setPassword(password);
		
		m.addAttribute("user", repo.save(user));
		
		return "dashboard";
	}
}
