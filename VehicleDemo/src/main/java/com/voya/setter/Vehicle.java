package com.voya.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	private Integer id;
	private String model;
	private String brand;
	private String price;
	
	@Autowired
	private Engine engine;


	public Integer getId() {
		return id;
	}
	@Value("15")
	public void setId(Integer id) {
		this.id = id;
	}


	public String getModel() {
		return model;
	}
	@Value("Sclass")
	public void setModel(String model) {
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}
	@Value("Mercedes")
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getPrice() {
		return price;
	}
	@Value("8000000")
	public void setPrice(String price) {
		this.price = price;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", model=" + model + ", brand=" + brand + ", price=" + price + ", engine=" + engine
				+ "]";
	}

}
