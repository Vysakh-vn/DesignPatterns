package com.vn.designpattern.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicLaptop implements Laptop {
	
	private int price;
	private static final Logger LOGGER = Logger.getLogger(BasicLaptop.class.getName());
	
	public BasicLaptop() {
		this.price = 20000;
	}
	
	@Override
	public void specifications() {
		LOGGER.log(Level.INFO, "Laptop with basic specification");
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
	

}
