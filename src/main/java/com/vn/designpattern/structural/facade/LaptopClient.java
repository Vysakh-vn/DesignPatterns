package com.vn.designpattern.structural.facade;

public class LaptopClient {
	
	public static void main(String[] args) {
		LaptopFacade laptop = new LaptopFacade();
		laptop.powerOn();
	}

}
