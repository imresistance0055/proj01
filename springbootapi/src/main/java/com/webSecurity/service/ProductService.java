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
	

	public List<Product> findAll() {
		
		return repo.findAll();

}
	
	

	public Product findById(Integer id) {
		
		return repo.findById(id).orElse(null);
}
	


	public String deleteByID(Integer id) {
		
		 repo.deleteById(id);
		 return"deleted successfuly";




}}