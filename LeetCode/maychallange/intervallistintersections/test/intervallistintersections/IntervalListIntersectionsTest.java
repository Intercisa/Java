package intervallistintersections;



import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class IntervalListIntersectionsTest {
	
	IntervalListIntersections intersections = new IntervalListIntersections();
	@Test
	void test_1() {
		
		int[][] arrOne = new int[][] {{0,2},{5,10},{13,23},{24,25}};
		int[][] arrTwo = new int[][] {{1,5},{8,12},{15,24},{25,26}};
		
		assertArrayEquals(
				new int[][] {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}}, 
				intersections.intervalIntersection(arrOne, arrTwo));
		
		
	}

}
