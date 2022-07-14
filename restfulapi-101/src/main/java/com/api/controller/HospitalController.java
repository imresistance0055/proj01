package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Hospital;
import com.api.service.HospitalService;

@RestController
@RequestMapping("/api")
public class HospitalController {
	
	@Autowired
	private HospitalService service;
	
	@PostMapping("/add")
	public Hospital save(@RequestBody Hospital hospital) {
		
		return service.save(hospital);
	}
	
	@GetMapping("/user")
public List<Hospital> get(){
	
	return  service.get();
	
}
	@GetMapping("/user/{id}")
	public Hospital getById(Integer id) {
		
		return service.findByID(id);
	}
	@DeleteMapping("/user/{id}")
	public String deleteById(Integer id) {
		
		return service.deleteById(id);
	}
	
	
}
