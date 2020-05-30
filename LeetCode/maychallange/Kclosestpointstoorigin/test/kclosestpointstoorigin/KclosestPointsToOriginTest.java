package kclosestpointstoorigin;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KclosestPointsToOriginTest {
	

	
	@Test
	void test_1() {
		assertArrayEquals(new int[][] {{-2,2}}, new KclosestPointsToOrigin().kClosest(new int[][] {{1,3},{-2,2}},1));
	}
	

	@Test
	void test_2() {
		assertArrayEquals(new int[][] {{3,3}, {-2,4}}, new KclosestPointsToOrigin().kClosest(new int[][] {{3,3},{5,-1},{-2,4}},2));
	}
}
