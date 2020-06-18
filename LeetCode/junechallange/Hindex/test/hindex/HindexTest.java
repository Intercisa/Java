package hindex;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HindexTest {

	@Test
	void test_1() {
		assertEquals(4, new Hindex().hIndex(new int[] {10, 8, 5, 4, 3}));
		
	}
	
	@Test
	void test_2() {
		assertEquals(3, new Hindex().hIndex(new int[] {25, 8, 5, 3, 3}));
		
	}
	
	@Test
	void test_3() {
		assertEquals(3, new Hindex().hIndex(new int[] {3,0,6,1,5}));
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
