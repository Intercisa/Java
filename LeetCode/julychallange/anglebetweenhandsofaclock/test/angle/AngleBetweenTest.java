package angle;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AngleBetweenTest {

	@Test
	void test_1() {
		assertEquals(165, new AngleBetween().angleClock(12, 30), 0.00001);
	}
	
	@Test
	void test_2() {
		assertEquals(75, new AngleBetween().angleClock(3, 30), 0.00001);
	}
	
	
	@Test
	void test_3() {
		assertEquals(7.5, new AngleBetween().angleClock(3, 15), 0.00001);
	}
	
	
	@Test
	void test_4() {
		assertEquals(155, new AngleBetween().angleClock(4, 50), 0.00001);
	}
	
	
	@Test
	void test_5() {
		assertEquals(0, new AngleBetween().angleClock(12, 0), 0.00001);
	}
}
