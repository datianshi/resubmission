package com.sample.myapp.form;

public class CarForm {
	String name;
	String model;
	String factoryProvider;
	Integer id;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFactoryProvider() {
		return factoryProvider;
	}
	public void setFactoryProvider(String factoryProvider) {
		this.factoryProvider = factoryProvider;
	}
	
	public String toString(){
		return "Id is: " + id + " " +name + " " + model + " " + factoryProvider;
	}
	
	
}
