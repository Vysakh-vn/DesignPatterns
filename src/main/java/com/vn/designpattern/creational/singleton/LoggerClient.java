package com.vn.designpattern.creational.singleton;

public class LoggerClient {
	
	
	public static void main(String[] args) {
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		Logger logger3 = Logger.getInstance();
		
		System.out.println("Logger 1 : " + logger1.hashCode());
		System.out.println("Logger 2 : " + logger2.hashCode());
		System.out.println("Logger 3 : " + logger3.hashCode());
		/*
		 * Here all the three print statement will print the same hash code since logger class in a singleton.
		 * 
		 * In the example of logger, singleton is useful in multi-threaded environment where logs should be consistent format and 
		 * logging behavior across all the threads without requiring all the threads to manage its own logger instance.
		 * 
		 */
	}

}
