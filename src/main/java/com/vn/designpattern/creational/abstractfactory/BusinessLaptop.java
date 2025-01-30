package com.vn.designpattern.creational.abstractfactory;

public class BusinessLaptop implements Laptop {
	
	@Override
	public void createLaptop() {
		toString();
	}
	
	public String toString() {
		return "Business laptop created";
	}

}
