package com.vn.designpattern.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BusinessLaptop implements Laptop {
	
	private int price;
	private static final Logger LOGGER = Logger.getLogger(BusinessLaptop.class.getName());
	
	public BusinessLaptop(int price) {
		this.price = price;
	}
	
	@Override
	public void specifications() {
		LOGGER.log(Level.INFO, "Business laptop with basic specification");
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
	

}
