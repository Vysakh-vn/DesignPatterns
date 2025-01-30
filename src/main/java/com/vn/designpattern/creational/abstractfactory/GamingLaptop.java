package com.vn.designpattern.creational.abstractfactory;

public class GamingLaptop implements Laptop {
	
	public void createLaptop() {
		toString();
	}
	
	@Override
	public String toString() {
		return "Gaming laptop created";
	}

}
