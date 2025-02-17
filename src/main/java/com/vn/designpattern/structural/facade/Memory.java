package com.vn.designpattern.structural.facade;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Memory {
	
	private static final Logger LOGGER = Logger.getLogger(Memory.class.getName());
	
	public void load() {
		LOGGER.log(Level.INFO, "Memory is loading ....");
	}

}
