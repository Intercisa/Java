package islandperimeter;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class IslandPerimeterTest {

	@Test
	void test_1() {
		int[][] grid = new int[][] {{0,1,0,0},
								    {1,1,1,0},
								    {0,1,0,0},
								    {1,1,0,0}};
		
		assertEquals(16, new IslandPerimeter().islandPerimeter(grid));
	}
}
