package com.vn.designpattern.structural.facade;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Battery {
	
	private static final Logger LOGGER = Logger.getLogger(Battery.class.getName());
	
	public void supplyPower() {
		LOGGER.log(Level.INFO, "Battery is suppying power...");
	}

}
