package com.osf.task;

import org.apache.log4j.Logger;

public class RemoteControle {
	
	//logger
	final static Logger LOG = Logger.getLogger(RemoteControle.class);
	
	public Car actualCar;
	public String key = "key";
	
	//if the door is open
	private static boolean isOpen = false;

	public RemoteControle(Car actualCar) {
		LOG.info("Constructor initialization, actualCar=" + actualCar);
		this.actualCar = actualCar;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Boolean pushOpenDoorButton() {
		LOG.info("pushOpenDoorButton method call");
		
		if(!isOpen) {
			isOpen = true;
			return (actualCar.openDoors(key)) ? true : false;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "RemoteControle [actualCar=" + actualCar + ", key=" + key + "]";
	}	
}
