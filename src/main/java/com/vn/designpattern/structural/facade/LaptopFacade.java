package com.vn.designpattern.structural.facade;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LaptopFacade {
	
	private CPU cpu;
	private Memory memory;
	private Storage storage;
	private Battery battery;
	
	private static final Logger LOGGER = Logger.getLogger(LaptopFacade.class.getName());
	
	public LaptopFacade() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.storage = new Storage();
		this.battery = new Battery();
	}

	public void powerOn() {
		cpu.start();
		memory.load();
		storage.boot();
		battery.supplyPower();
		LOGGER.log(Level.INFO, "Laptop is ready to use.");
	}
	
}
