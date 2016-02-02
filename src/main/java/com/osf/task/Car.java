package com.osf.task;

import org.apache.log4j.Logger;

public class Car {
	//logger
	final static Logger LOG = Logger.getLogger(Car.class);

	public String key = "key";
	
	public Boolean openDoors(String key) {
		
		LOG.info("openDoors(" + key + ")");
		if(this.key.equals(key)) {
			
			LOG.info("Door now is open");
			return true;
		}
		
		LOG.info("Door now is close");
		return false;
	}

	@Override
	public String toString() {
		return "Car [key=" + key + "]";
	}		
}
