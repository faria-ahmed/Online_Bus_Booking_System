package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BusbookingTest {
	public BusbookingTest () {
		
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass()  {
	}


	@Test
	public void testBusCheck () {
		System.out.println ("busCheck");
		String no = "5003" ;
		String name = "Economy";
		Busbooking instance = new Busbooking ();
		String expR = "pass";
		String result = instance.busCheck(no , name);
		assertEquals(expR, result);
	}
	
	@Test
	public void testLocationCheck () {
		System.out.println ("locationCheck");
		String tname = "Jamalkhan" ;
		String cityn = "Chattogram";
		Busbooking is = new Busbooking ();
		String expR = "pass";
		String result = is.locationCheck(tname,cityn);
		assertEquals(expR, result);
	}
	
	public void testScheduleCheck () {
		System.out.println ("locationCheck");
		String avail = "35" ;
		String pricetk = "350";
		Busbooking bo = new Busbooking ();
		String expR = "pass";
		String result = bo.scheduleCheck(avail,pricetk);
		assertEquals(expR, result);
	}
	public void test() {
		fail("Not yet implemented");
	}

}
