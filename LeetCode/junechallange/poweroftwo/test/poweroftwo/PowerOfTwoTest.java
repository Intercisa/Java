package poweroftwo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

	@Test
	void test_1() {
		assertEquals(true, new PowerOfTwo().isPowerOfTwo(1));
	}
	
	@Test
	void test_2() {
		assertEquals(true, new PowerOfTwo().isPowerOfTwo(16));
	}
	
	@Test
	void test_3() {
		assertEquals(false, new PowerOfTwo().isPowerOfTwo(218));
	}
	
	@Test
	void test_4() {
		assertEquals(false, new PowerOfTwo().isPowerOfTwo(0));
	}
	
	@Test
	void test_5() {
		assertEquals(false, new PowerOfTwo().isPowerOfTwo(-16));
	}
}
