package com.Model_API.controller;

import org.springframework.web.bind.annotation.RestController;

import com.Model_API.entity.UserEntity;
import com.Model_API.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserController {
   
	@Autowired
	private UserService us;
	
	@GetMapping("/user")
	public String getMethodName() {
		return "Get Request";
	}
	
	@GetMapping("/users/{id}")
	public UserEntity getUserByID(@PathVariable("id") Long UserId) {
    	return us.getUserById(UserId);
    }
	
	@GetMapping("/users")
	public List<UserEntity> getUserList() {
		return us.getAllUsers();
	}
	
	
}
