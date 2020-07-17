package topKfrequentelements;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TopKTest {

	@Test
	void test_1() {
		assertArrayEquals(new int[] {1,2},new TopK().topKFrequent(new int[] {1,1,1,2,2,3},2));
	}
	
	@Test
	void test_2() {
		assertArrayEquals(new int[] {1},new TopK().topKFrequent(new int[] {1},1));
	}
}
