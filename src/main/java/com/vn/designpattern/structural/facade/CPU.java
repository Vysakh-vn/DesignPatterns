package com.vn.designpattern.structural.facade;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CPU {
	
	private static final Logger LOGGER = Logger.getLogger(CPU.class.getName());
	
	public void start() {
		LOGGER.log(Level.INFO, "CPU is starting ....");
	}

}
