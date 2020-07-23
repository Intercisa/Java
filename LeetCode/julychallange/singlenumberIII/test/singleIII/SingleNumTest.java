package singleIII;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SingleNumTest {

	@Test
	void test_1() {
		assertArrayEquals(new int[] {3,5}, new SingleNum().singleNumber(new int[] {1,2,1,3,2,5}));
	}
}
