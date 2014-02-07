package com.sample.myapp.form;


public class HotelForm {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	String name;
	String address;
	String rate;
	
	public String toString(){
		return name + " " + address + " " + rate;
	}
	
}
