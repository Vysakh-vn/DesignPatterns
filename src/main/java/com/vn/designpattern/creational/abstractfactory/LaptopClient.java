package com.vn.designpattern.creational.abstractfactory;

public class LaptopClient {
	
	public static void main(String[] args) {
		LaptopFactory gamingLaptopFactory = new GamingLaptopFactory();
		Laptop gamingLaptop = gamingLaptopFactory.createLaptop();
		System.out.println(gamingLaptop);
		
		LaptopFactory businessLaptopFactory = new BusinessLaptopFactory();
		Laptop businessLaptop = businessLaptopFactory.createLaptop();
		System.out.println(businessLaptop);
	}

}
