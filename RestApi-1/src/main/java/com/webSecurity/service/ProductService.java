package com.webSecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webSecurity.entity.Product;
import com.webSecurity.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public Product save(Product product) {

		return repo.save(product);

	}

	public Product getById(String product_name) {

		return repo.findById(product_name).orElse(null);
	}

	public String delete(String product_name) {

		repo.deleteById(product_name);
		return "deleted";
	}

	public List<Product> get() {

		return repo.findAll();
	}

}