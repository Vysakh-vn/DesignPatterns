package com.vn.designpattern.creational.factory;

public class LaptopFactory {
	
	public static Laptop getLaptop(String type) {
		if("Gaming".equals(type)) {
			return new Laptop(2000, 32, "ROG", "Intel i9", "Black");
		} else {
			throw new IllegalArgumentException();
		}
	}

}
