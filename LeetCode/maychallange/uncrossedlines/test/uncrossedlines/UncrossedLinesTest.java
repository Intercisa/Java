package uncrossedlines;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class UncrossedLinesTest {

	@Test
	void test_1() {
		assertEquals(2, new UncrossedLines().maxUncrossedLines(new int[] {1,4,2}, new int[] {1,2,4}));
	}
	
	@Test
	void test_2() {
		assertEquals(3, new UncrossedLines().maxUncrossedLines(new int[] {2,5,1,2,5}, new int[] {10,5,2,1,5,2}));
	}
	
	@Test
	void test_3() {
		assertEquals(2, new UncrossedLines().maxUncrossedLines(new int[] {1,3,7,1,7,5}, new int[] {1,9,2,5,1}));
	}
}
