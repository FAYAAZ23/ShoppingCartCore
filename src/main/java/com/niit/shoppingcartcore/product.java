package com.niit.shoppingcartcore;

import org.springframework.stereotype.Component;

@Component
public class product {
	private String id;
	private String name;
	private String price;
	public String getId(){
	 return id;
		
	}
public void setId(String id) {
	this.id = id;
	
}
public String getName() {
	return name;
	
}
public void setName(String name) {
	this.name = name;
	
}
public void getPrice(String price) {
	this.price = price;
	
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
}
