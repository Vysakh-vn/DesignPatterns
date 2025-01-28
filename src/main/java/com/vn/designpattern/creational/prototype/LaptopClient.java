package com.vn.designpattern.creational.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LaptopClient {
	
	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());

	public static void main(String args[]) {
		 
		/*
		 * Here we are creating two laptop instance using the regular constructor. Since laptop instance creation is a time consuming process 
		 * creating two instances will take significant amount of time and affect perfomance.
		 * 		 */
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		Laptop laptop1 = new Laptop(512, 8, "Intel i3", "DELL", "Black");
		Laptop laptop2 = new Laptop(256, 4 , "Intel i3", "Dell", "Black");
		endTime = System.currentTimeMillis();
		LOGGER.log(Level.INFO, "Two laptop created in : {0} milliseconds", endTime - startTime);
		
		/*
		 * Below we are using clone method to create the clone of the already created laptop instance and then modifying only the required values,
		 * since we are cloning there will be significant improvement in perfomance.
		 */
		
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
