package hindex;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HindexTest {

	
	@Test
	void test_3() {
		assertEquals(3, new Hindex().hIndex(new int[] {0,1,3,5,6}));
	}
	
	@Test
	void test_4() {
		assertEquals(1, new Hindex().hIndex(new int[] {1}));
	}
	
	
	@Test
	void test_5() {
		assertEquals(0, new Hindex().hIndex(new int[] {0}));
	}



}
