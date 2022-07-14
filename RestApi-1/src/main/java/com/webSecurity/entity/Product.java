package com.webSecurity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	
	private String product_name;
	@Id
	private int id;
	private int price;
	public Product(String product_name, int id, int price) {
		super();
		this.product_name = product_name;
		this.id = id;
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", id=" + id + ", price=" + price + "]";
	}

	
	
}
