package searchinsertposition;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {
	

	
	@Test
	void test_1() {
		assertEquals(2, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 5));
	}

	@Test
	void test_2() {
		assertEquals(1, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 2));
	}
	
	@Test
	void test_3() {
		assertEquals(4, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 7));
	}
	
	@Test
	void test_4() {
		assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 0));
	}
	
	@Test
	void test_5() {
		assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1}, 1));
	}
	
	@Test
	void test_6() {
		assertEquals(2, new SearchInsertPosition().searchInsert(new int[] {1,3,5}, 4));
	}
	
	
}
