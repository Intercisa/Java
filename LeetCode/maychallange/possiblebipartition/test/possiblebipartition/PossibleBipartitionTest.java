package possiblebipartition;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PossibleBipartitionTest {

	@Test
	void test_1() {
		
		assertEquals(true, new PossibleBipartition().possibleBipartition(4, new int[][] {{1,2},{1,3},{2,4}}));

	}
	@Test
	void test_2() {
		
		assertEquals(false, new PossibleBipartition().possibleBipartition(3, new int[][] {{1,2},{1,3},{2,3}}));
	}
	@Test
	void test_3() {
		
		assertEquals(false, new PossibleBipartition().possibleBipartition(5, new int[][] {{1,2},{2,3},{3,4},{4,5},{1,5}}));
	}
}
