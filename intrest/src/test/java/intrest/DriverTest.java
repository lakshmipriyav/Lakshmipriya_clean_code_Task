package intrest;

import static org.junit.Assert.*;

import org.junit.Test;

public class DriverTest {
	private static final double DELTA = 1e-15;

	
	@Test
	public void test() {
		Driver d=new Driver();
		double si=d.simpleIntrest(1000.0,2,3.0);
		double ci=d.compoundIntrest(10000.0,2,5.0);
		assertEquals(60.0,si,DELTA);
		assertEquals(1025.0,ci,DELTA);
	}

}
