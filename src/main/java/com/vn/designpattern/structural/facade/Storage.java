package com.vn.designpattern.structural.facade;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Storage {
	
	private static final Logger LOGGER = Logger.getLogger(Storage.class.getName());
	
	public void boot() {
		LOGGER.log(Level.INFO, "Storage is booting the system ...");
	}

}
