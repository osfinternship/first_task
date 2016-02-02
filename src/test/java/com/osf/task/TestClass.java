package com.osf.task;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

/**
 * Unit test
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestClass {
	
	//logger
	final static Logger LOG = Logger.getLogger(TestClass.class);

	//this method runs before unit and using for initializations of instances
    @BeforeClass
    public static void runBeforeClass() {
    	//TODO
    }
    
	//this method runs after unit and using for dispose memory(garbage constructor)
    @AfterClass
    public static void runAfterClass() {
    	//TODO
    }
    
    @Test
   	public void test1() {
		Car myCar = new Car();
		LOG.debug("Creating car instance");
		
		RemoteControle rm1 = new RemoteControle(myCar);
		LOG.debug("Creating first RemoteControleInstance");
		
		RemoteControle rm2 = new RemoteControle(myCar);
		LOG.debug("Creating second RemoteControleInstance");
		
		boolean firstTry = rm1.pushOpenDoorButton();
				
		rm2.setKey(rm1.getKey());
		LOG.debug("rm2 set key from rm1");
		
		boolean secondTry = rm2.pushOpenDoorButton();

//		assertEquals(firstTry, !secondTry);
		
		LOG.info("firstTry=" + firstTry + ", secondTry=" + secondTry);
		
		if(firstTry && !secondTry) {
			LOG.info("Working");
		} else {
			LOG.info("Not working");
		}
	}	
}
