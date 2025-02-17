package com.vn.designpattern.structural.facade;

public class LaptopClient {
	
	public static void main(String[] args) {
        // The client uses the facade to power on the laptop without needing to know the details of each subsystem.
		LaptopFacade laptop = new LaptopFacade();
		laptop.powerOn();
	}

}
