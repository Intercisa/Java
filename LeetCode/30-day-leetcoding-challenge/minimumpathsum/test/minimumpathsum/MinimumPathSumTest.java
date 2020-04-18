package minimumpathsum;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MinimumPathSumTest {

	private MinimumPathSum minimumPath = new MinimumPathSum();
	
	@Test
	void test_1() {
		assertEquals(7, minimumPath.minPathSum(new int[][] {{1,3,1},{1,5,1,},{4,2,1}}));
	}
	

}
