package com.vn.designpattern.structural.decorator;

public abstract class LaptopDecorator implements Laptop {
	
	private Laptop laptop;
	
	protected LaptopDecorator(Laptop laptop) {
		this.laptop = laptop;
	}
	
	@Override
	public void specifications() {
		laptop.specifications();
	}
	
	@Override
	public int getPrice() {
		return laptop.getPrice();
	}

}
