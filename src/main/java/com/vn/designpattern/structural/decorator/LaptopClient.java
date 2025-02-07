package com.vn.designpattern.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LaptopClient {
	
	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());
	
	/*
	 * - BasicLaptop represent a simple laptop.
	 * - BusinessLaptopDecorator extends BasicLaptop with additional business features.
	 * - The decorator pattern allows wrapping basiclaptop to create businessLaptop with enhanced features.
	 */
	public static void main(String[] args) {
		Laptop basicLaptop = new BasicLaptop();
		basicLaptop.specifications();
		LOGGER.log(Level.INFO, "Price : {0} ", basicLaptop.getPrice());
		
		Laptop businessLaptop = new BusinessLaptopDecorator(basicLaptop);
		businessLaptop.specifications();
		LOGGER.log(Level.INFO, "Price : {0}", businessLaptop.getPrice());
	}

}
