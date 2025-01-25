package com.vn.designpattern.creational.builder;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LaptopClient {

	private static final Logger LOGGER = Logger.getLogger(LaptopClient.class.getName());

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop(256, 8, "Intel i5", "hp", "windows", "white");
		LOGGER.log(Level.INFO, "Laptop 1 {0}", laptop1);

		Laptop laptop2 = new Laptop.Builder().brand("Lenovo").storage(512).ram(16).processor("Intel i9").os("Ubuntu")
				.colour("Black").build();
		LOGGER.log(Level.INFO, "Laptop 2 {0}", laptop2);
		
		Laptop laptop3 = new Laptop.Builder().brand("Apple").build();
		LOGGER.log(Level.INFO, "Laptop 3 {0}", laptop3);
	}
}
