package com.vn.designpattern.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;


public class BusinessLaptopDecorator extends LaptopDecorator{

	private static final Logger LOGGER = Logger.getLogger(BusinessLaptopDecorator.class.getName());
	
	public BusinessLaptopDecorator(Laptop laptop) {
		super(laptop);
	}
	
	@Override
	public void specifications() {
		super.specifications();
		LOGGER.log(Level.INFO, "Business specification added.");
	}
	
	@Override
	public int getPrice() {
		return super.getPrice() + 2000;
	}
}
