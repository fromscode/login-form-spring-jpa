package com.example.loginform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loginform.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
