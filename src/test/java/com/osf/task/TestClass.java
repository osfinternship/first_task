package com.osf.task;

import junit.framework.TestCase;

public class TestClass extends TestCase{
	public static void test1() {
		Car myCar = new Car();
		
		RemoteControle rm1 = new RemoteControle(myCar);
		RemoteControle rm2 = new RemoteControle(myCar);
		
		boolean firstTry = rm1.pushOpenDoorButton();
				
		rm2.setKey(rm1.getKey());
		
		boolean secondTry = rm2.pushOpenDoorButton();
				
		if(firstTry && !secondTry) {
			System.out.println("working");
		} else {
			System.out.println("not working");
		}
	}	
}
