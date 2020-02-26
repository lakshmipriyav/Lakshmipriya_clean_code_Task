package intrest;

import static org.junit.Assert.*;

import org.junit.Test;

public class housePriceTest {
	private static final double DELTA = 1e-15;

	@Test
	public void test() {

		housePrice h=new housePrice();
		double cost1=h.totalCost("standard",100.0);
		double cost2=h.totalCost("above standard",100.0);
		double cost3=h.totalCost("high standard",100.0);
		double cost4=h.totalCost("high standard and fully automated",100.0);
		assertEquals(120000.0,cost1,DELTA);
		assertEquals(150000.0,cost2,DELTA);
		assertEquals(180000.0,cost3,DELTA);
		assertEquals(250000.0,cost4,DELTA);
	}
	

}
