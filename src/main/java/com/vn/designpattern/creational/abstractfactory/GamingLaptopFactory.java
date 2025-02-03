package com.vn.designpattern.creational.abstractfactory;

public class GamingLaptopFactory implements LaptopFactory {
	
	@Override
	public Laptop createLaptop() {
		return new GamingLaptop();
	}
	
}
