package com.vn.designpattern.creational.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *@author VYSAKH V N
 */
public class LaptopClient {
	
	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());
	
	public static void main(String[] args) {
		/*
		 * Below we are creating a gaming laptop object using the new keyword in the client code. This approach
		 * have following drawbacks.
		 * 	1. Tight coupling
		 * 		. High level module is directly depending upon implementation of laptop class violating DIP.
		 * 		. Any change in the gaming laptop class like moving the class to new package, change in constructor,
		 * 		  renaming with directly affect the client code.
		 * 	2. Lack of scalability
		 * 		. Introduction of new implementations like student laptop etc will create code change in the client 
		 * 		  code as the object creation is handled here.		 * 	
		 */
		Laptop laptop1 = new GamingLaptop();
		LOGGER.log(Level.INFO, laptop1.getConfiguration());
		
		/*
		 * Here we are using the factory class to for object creation. This approach have the 
		 * following advantages:
		 * 
		 *  1. Loose coupling
		 *  	. The client code depends only one the abstraction of laptop adhering to DIP.
		 *  	. Changes in in the implementation will not affect the client code (moving to a new package, change
		 *  	  in constructor, renaming etc).
		 *  2. Scalability
		 *  	. Adding new implementation like student laptop requires change only in the factory class adhering to SRP
		 *  	  and OCP.
		 */
		
		Laptop gamingLaptop = LaptopFactory.getLaptop("Gaming");
		Laptop businessLaptop = LaptopFactory.getLaptop("Business");
		Laptop ultraBook = LaptopFactory.getLaptop("UltraBook");
		
		LOGGER.log(Level.INFO, gamingLaptop.getConfiguration());
		LOGGER.log(Level.INFO, businessLaptop.getConfiguration());
		LOGGER.log(Level.INFO, ultraBook.getConfiguration());
	}

}
