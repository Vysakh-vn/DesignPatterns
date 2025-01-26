package com.vn.designpattern.creational.factory;

public class LaptopFactory {
	
	public static Laptop getLaptop(String type) {
		switch(type) {
			case "Gaming" : return new GamingLaptop();
			case "Business" : return new BusinessLaptop();
			case "UltraBook" : return new UltraBook();
			default : throw new IllegalArgumentException("Unknow laptop type : " + type);
		}
		
	}
}
