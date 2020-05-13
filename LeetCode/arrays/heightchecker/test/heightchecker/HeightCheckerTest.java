package heightchecker;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HeightCheckerTest {
	private HeightChecker hCheck = new HeightChecker();
	
	@Test
	void test_1() {
		assertEquals(3, hCheck.heightChecker(new int[] {1,1,4,2,1,3}));
	}
	
	@Test
	void test_2() {
		assertEquals(5, hCheck.heightChecker(new int[] {5,1,2,3,4}));
	}
	
	@Test
	void test_3() {
		assertEquals(0, hCheck.heightChecker(new int[] {1,2,3,4,5}));
	}
}
