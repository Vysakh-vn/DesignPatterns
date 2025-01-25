package com.vn.designpattern.creational.builder;

public class Laptop {
	
	private int storage;
	private int ram;
	private String processor;
	private String brand;
	private String os;
	private String colour;
	private int ssd;

	public Laptop(int storage, int ram, String processor, String brand, String os, String colour) {
		this.storage = storage;
		this.ram = ram;
		this.processor = processor;
		this.brand = brand;
		this.os = os;
		this.colour = colour;
	}
	
	public Laptop(int storage, int ram, String processor, String brand, String os, String colour, int ssd) {
		this.storage = storage;
		this.ram = ram;
		this.processor = processor;
		this.brand = brand;
		this.os = os;
		this.colour = colour;
		this.ssd = ssd;
	}
	
	public Laptop(Builder builder) {
		this.storage = builder.storage;
		this.ram = builder.ram;
		this.processor = builder.processor;
		this.brand = builder.brand;
		this.os = builder.os;
		this.colour = builder.colour;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.colour).append(", ").append(this.os).append(", ").append(this.brand).append(" laptop created with ")
		.append(this.storage).append(" storage, ").append(this.ram).append(" ram and ").append(this.processor).append(" processor.");
		return builder.toString();
	}
	
	static class Builder {
		private int storage = 512;
		private int ram = 8;
		private String processor = "Intel i7";
		private String brand = "DELL";
		private String os = "Linux";
		private String colour = "Black";
		
		public Builder storage(int storage) {
			this.storage = storage;
			return this;
		}
		
		public Builder ram(int ram) {
			this.ram = ram;
			return this;
		}
		
		public Builder processor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public Builder brand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public Builder os(String os) {
			this.os = os;
			return this;
		}
		
		public Builder colour(String colour) {
			this.colour = colour;
			return this;
		}
		
		public Laptop build() {
			return new Laptop(this);
		}
	}
}
