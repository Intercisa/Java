package houserobber;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HouseRobberTest {

	@Test
	void test_1() {
		assertEquals(4, new HouseRobber().rob(new int[] {1,2,3,1}));
	}
	@Test
	void test_2() {
		assertEquals(12, new HouseRobber().rob(new int[] {2,7,9,3,1}));
	}
	

}
