package com.example.loginform.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class User {
	
	@Id
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Transient
	private String confirmPassword;
	
	@Column(nullable = false)
	private String securityQuestion;
	
	@Column(nullable = false)
	private String securityAnswer;
	
	@Column(nullable = false)
	private String phoneNumber;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", securityQuestion=" + securityQuestion + ", securityAnswer=" + securityAnswer + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
}
