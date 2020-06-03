package twocityscheduling;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TwoCitySchedulingTest {

	@Test
	void test_1() {
		
		assertEquals(110, new TwoCityScheduling().twoCitySchedCost(new int[][] {{10,20},{30,200},{400,50},{30,20}}));
		
	}
	@Test
	void test_2() {
		
		assertEquals(1859, new TwoCityScheduling().twoCitySchedCost(new int[][] {{259,770},{448,54},{926, 667},{184,139},{840,118},{577,469}}));
		
	}
}
