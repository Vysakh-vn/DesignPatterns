package com.vn.designpattern.creational.prototype;

public class Laptop implements Cloneable {
	
	private int storage;
	private int ram;
	private String processor;
	private String brand;
	private String colour;
	
	public Laptop(int storage, int ram, String processor, String brand, String colour) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.storage = storage;
		this.ram = ram;
		this.processor = processor;
		this.brand = brand;
		this.colour = colour;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	@Override
	public Laptop clone() {
        try {
            return (Laptop) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.colour).append(", ").append(this.brand).append(" laptop created with ")
		.append(this.storage).append(" storage, ").append(this.ram).append(" ram and ").append(this.processor).append(" processor.");
		return builder.toString();
	}
	

}
