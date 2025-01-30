package com.vn.designpattern.creational.abstractfactory;

public class BusinessLaptopFactory implements LaptopFactory {
	
	@Override 
	public Laptop createLaptop() {
		return new BusinessLaptop();
	}

}
