package com.webSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webSecurity.entity.User;
import com.webSecurity.service.UserService;

@RestController
@RequestMapping("/todo")
public class UserController {
	
	@Autowired
	
	private UserService service;
	
	@PostMapping("/hello")
	public User save (@RequestBody User user) {
		
		
		return service.save(user);
	}
	@GetMapping("/api")
	public List<User> get(){
		
		return service.get();
	}
	@GetMapping("/api/{id}")
	public User GetById(Integer id) {
		
		return service.getById(id);
	}
	@DeleteMapping("api/{id}")
public String deleteById(Integer id) {
		
	service.deleteById(id);
	return "deleted";
	
}}
