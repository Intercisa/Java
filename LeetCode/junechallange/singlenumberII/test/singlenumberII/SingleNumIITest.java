package singlenumberII;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SingleNumIITest {

	@Test
	void test_1() {
		assertEquals(3, new SingleNumII().singleNumber(new int[] { 2, 2, 3, 2 }));
	}

	@Test
	void test_2() {
		assertEquals(99, new SingleNumII().singleNumber(new int[] { 0, 1, 0, 1, 0, 1, 99 }));
	}
}