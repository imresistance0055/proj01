package com.webSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webSecurity.entity.Product;
import com.webSecurity.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	
	private ProductService service;
	
	@PostMapping("/add")
	public Product save(@RequestBody Product product) {
		
		return service.save(product);
	}
	@GetMapping("/user")
	public List<Product> get(){
		
		return service.get();
	}
	
	@GetMapping("/user/{product_name}")
	public Product getByname(String product_name) {
	
	return service.getById(product_name);

}
	@DeleteMapping("/user/{product_name}")
	public String deleteById(String product_name) {
		
		return service.delete(product_name);
	}
}