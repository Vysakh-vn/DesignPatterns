package com.vn.designpattern.creational.singleton;

public class Logger {
	
	private static Logger INSTANCE;
	
	private Logger() {} // making the default constructor private.
	
	public static Logger getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Logger();
		}
		return INSTANCE;
	}

}
