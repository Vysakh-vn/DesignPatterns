package com.vn.designpattern.structural.decorator;

import org.yaml.snakeyaml.internal.Logger;

public class BusinessLaptopDecorator extends LaptopDecorator{

	private static final Logger LOGGER = Logger.getLogger(BusinessLaptopDecorator.class.getName());
	
	public BusinessLaptopDecorator(Laptop laptop) {
		super(laptop);
	}
	
	@Override
	public void specifications() {
	}
	
}
