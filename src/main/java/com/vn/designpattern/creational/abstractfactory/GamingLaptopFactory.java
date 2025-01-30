package com.vn.designpattern.creational.abstractfactory;

public class GamingLaptopFactory implements LaptopFactory {
	
	public Laptop createLaptop() {
		return new GamingLaptop();
	}
	
}
