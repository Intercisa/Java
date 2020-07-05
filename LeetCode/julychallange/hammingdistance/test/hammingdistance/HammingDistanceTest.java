package hammingdistance;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HammingDistanceTest {

	@Test
	void test_1() {
		assertEquals(2, new HammingDistance().hammingDistance(1,4));
	}
	
	
	@Test
	void test_2() {
		assertEquals(2, new HammingDistance().hammingDistanceChar(1,4));
	}
}
