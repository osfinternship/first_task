package com.osf.task;

public class Car {
	public String key = "key";
	
	public Boolean openDoors(String key) {
		if(this.key.equals(key))
			return true;
		
		return false;
	}	
}
