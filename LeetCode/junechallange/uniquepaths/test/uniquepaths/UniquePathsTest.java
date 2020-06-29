package uniquepaths;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class UniquePathsTest {

	@Test
	void test_1() {
		assertEquals(3, new UniquePaths().uniquePaths(3, 2));
	}
	
	@Test
	void test_2() {
		assertEquals(28, new UniquePaths().uniquePaths(7, 3));
	}
}
