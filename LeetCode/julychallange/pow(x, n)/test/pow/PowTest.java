package pow;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PowTest {

	@Test
	void test_1() {
		assertEquals(1024.00000, new Pow().myPow(2.00000, 10), 0000.1);
	}
	
	@Test
	void test_2() {
		assertEquals(0.25000, new Pow().myPow(2.00000, -2), 0000.1);
	}
	
	@Test
	void test_3() {
		assertEquals(9.26100, new Pow().myPow(2.10000, 3), 0000.1);
	}
	
	@Test
	void test_4() {
		assertEquals(1, new Pow().myPow(0.44528, 0), 0000.1);
	}
	
	@Test
	void test_5() {
		assertEquals(1, new Pow().myPow(1.00000, 2147483647), 0000.1);
	}
	
	
	@Test
	void test_6() {
		assertEquals(0, new Pow().myPow(2.00000, -2147483648), 0000.1);
	}
	
}

