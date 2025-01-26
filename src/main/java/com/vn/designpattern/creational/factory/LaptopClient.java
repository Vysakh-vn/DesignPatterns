package com.vn.designpattern.creational.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *@author VYSAKH V N
 */
public class LaptopClient {
	
	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());
	
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop(512, 8, "hp", "intel i5", "black");
		LOGGER.log(Level.INFO, "Laptop 1 : " + laptop1);
	}

}
