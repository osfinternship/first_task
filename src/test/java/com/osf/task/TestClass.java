package com.osf.task;

import org.apache.log4j.Logger;

import junit.framework.TestCase;

/**
 * Unit test
 */
public class TestClass extends TestCase{
	
	//logger
	final static Logger LOG = Logger.getLogger(TestClass.class);

	public static void test1() {
		Car myCar = new Car();
		LOG.debug("Creating car instance");
		
		RemoteControle rm1 = new RemoteControle(myCar);
		LOG.debug("Creating first RemoteControleInstance");
		
		RemoteControle rm2 = new RemoteControle(myCar);
		LOG.debug("Creating second RemoteControleInstance");
		
		boolean firstTry = rm1.pushOpenDoorButton();
				
		rm2.setKey(rm1.getKey());
		
		boolean secondTry = rm2.pushOpenDoorButton();
				
		if(firstTry && !secondTry) {
			LOG.info("Working");
		} else {
			LOG.info("Not working");
		}
	}	
}
