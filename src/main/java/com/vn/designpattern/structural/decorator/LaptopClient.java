package com.vn.designpattern.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LaptopClient {
	
	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());
	
	public static void main(String[] args) {
		Laptop basicLaptop = new BasicLaptop();
		basicLaptop.specifications();
		LOGGER.log(Level.INFO, "Price : {0} ", basicLaptop.getPrice());
		
		Laptop businessLaptop = new BusinessLaptopDecorator(basicLaptop);
		businessLaptop.specifications();
		LOGGER.log(Level.INFO, "Price : {0}", businessLaptop.getPrice());
	}

}
