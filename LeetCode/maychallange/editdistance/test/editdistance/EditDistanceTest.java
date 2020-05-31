package editdistance;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class EditDistanceTest {
	

	
	@Test
	void test_1() {
		assertEquals(3, new EditDistance().minDistance("horse", "ros"));
	}

	@Test
	void test_2() {
		assertEquals(5, new EditDistance().minDistance("intention", "execution"));
	}
}
