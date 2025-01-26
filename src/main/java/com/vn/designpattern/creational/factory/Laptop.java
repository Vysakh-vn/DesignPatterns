package com.vn.designpattern.creational.factory;

public class Laptop {
	
	private int storage;
	private int ram;
	private String brand;
	private String processor;
	private String colour;
	
	public Laptop(int storage, int ram, String brand, String processor, String colour) {
		this.storage = storage;
		this.ram = ram;
		this.brand = brand;
		this.processor = processor;
		this.colour = colour;
	}
	
	public String toString() {
		return String.format("Created %s %s laptop with %s GB storage, %s ram and %s processor.", 
				colour, brand, storage, ram, processor);
	}

}
