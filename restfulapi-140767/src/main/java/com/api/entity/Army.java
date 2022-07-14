package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Army {
	
	
	private int id;
	@Id
	private String name;
	private String location;
	private float salary;
	public Army(int id, String name, String location, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Army() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Army [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	
	

}
