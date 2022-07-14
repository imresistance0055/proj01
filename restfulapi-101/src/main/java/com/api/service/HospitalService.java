package com.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.api.entity.Hospital;
import com.api.repository.HospitalRepository;

@Component
public class HospitalService {
	@Autowired
	private HospitalRepository repo;
	
	
	public Hospital save(Hospital hospital) {
		
		return repo.save(hospital);
	}

	public List<Hospital> get(){
		
		
		return repo.findAll();
	}
	public Hospital findByID(Integer id) {
		
		return repo.findById(id).orElse(null);
	}
	
	public String deleteById(Integer id) {
		
		
	repo.deleteById(id);
	
	return"deleted";
	}

	
	
	
	
}
