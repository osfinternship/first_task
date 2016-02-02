package com.osf.task;

public class RemoteControle {
	
public Car actualCar;
public String key = "key";


public RemoteControle(Car actualCar) {
	this.actualCar = actualCar;
}


public String getKey() {
	return key;
}

public void setKey(String key) {
	this.key = key;
}


public Boolean pushOpenDoorButton() {
	return (actualCar.openDoors(key)) ? true : false;
}	
}
