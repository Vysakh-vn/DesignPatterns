package com.vn.designpattern.creational.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *@author VYSAKH V N
 */
public class LaptopClient {
	
	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());
	
	public static void main(String[] args) {
		Laptop gamingLaptop = LaptopFactory.getLaptop("Gaming");
		Laptop businessLaptop = LaptopFactory.getLaptop("Business");
		Laptop ultraBook = LaptopFactory.getLaptop("UltraBook");
		
		LOGGER.log(Level.INFO, gamingLaptop.getConfiguration());
		LOGGER.log(Level.INFO, businessLaptop.getConfiguration());
		LOGGER.log(Level.INFO, ultraBook.getConfiguration());
	}

}
