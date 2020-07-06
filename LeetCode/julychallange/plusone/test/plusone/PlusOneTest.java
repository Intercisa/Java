package plusone;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PlusOneTest {

	@Test
	void test_1() {
		assertArrayEquals(new int[] {1,2,4}, new PlusOne().plusOne(new int[] {1,2,3}));
	}
	
	@Test
	void test_2() {
		assertArrayEquals(new int[] {4,3,2,2}, new PlusOne().plusOne(new int[] {4,3,2,1}));
	}
}
