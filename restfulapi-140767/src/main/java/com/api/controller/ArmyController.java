package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Army;
import com.api.service.ArmyService;

@RestController
@RequestMapping("/api")
public class ArmyController {
	
	@Autowired
	private ArmyService service;
	
	@PostMapping("/add")
	public Army save(@RequestBody Army army) {
		
		return service.save(army);
	}
	
	public List<Army> get(){
		
		return service.get();
	}
	
	
	public Army getByName(String name) {
		
		return service.findById(name);
	}
	
	public String deleteBYId(String name) {
		
		service.deleteById(name);
		
		return "deleted";
	}

}
