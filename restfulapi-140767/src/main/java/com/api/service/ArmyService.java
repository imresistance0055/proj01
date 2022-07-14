package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Army;
import com.api.repository.ArmyRepository;

@Service
public class ArmyService {
	@Autowired
	private ArmyRepository repo;

	public Army save(Army army) {

		return repo.save(army);
	}

	public List<Army> get() {

		return repo.findAll();
	}

	public Army findById(String name) {

		return repo.findById(name).orElse(null);
	}

	public String deleteById(String name) {

		repo.deleteById(name);
		return "deleted";

	}

}
