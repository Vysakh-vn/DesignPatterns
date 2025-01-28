package com.vn.designpattern.creational.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LaptopClient {
	
	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());

	public static void main(String args[]) {
		 
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		Laptop laptop1 = new Laptop(512, 8, "Intel i3", "DELL", "Black");
		Laptop laptop2 = new Laptop(256, 4 , "Intel i3", "Dell", "Black");
		endTime = System.currentTimeMillis();
		LOGGER.log(Level.INFO, "Two laptop created in : {0} milliseconds", endTime - startTime);
		
		startTime = System.currentTimeMillis();
		Laptop laptop3 = laptop1.clone();
		laptop3.setBrand("hp");
		laptop3.setColour("White");
		Laptop laptop4 = laptop1.clone();
		laptop4.setProcessor("Intel i5");
		laptop4.setStorage(512);
		endTime = System.currentTimeMillis();
		LOGGER.log(Level.INFO, "Two clone laptop created in : {0} milliseconds", endTime - startTime);
	}
}
