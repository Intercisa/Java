package searchinrotatedsortedarray;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {

	private SearchInRotatedSortedArray rotatedSortedArray = new SearchInRotatedSortedArray();
	
	@Test
	void test_1() {
		assertEquals(4, rotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 0));
	}
	
	@Test
	void test_2() {
		assertEquals(-1, rotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 3));
	}
	


}
