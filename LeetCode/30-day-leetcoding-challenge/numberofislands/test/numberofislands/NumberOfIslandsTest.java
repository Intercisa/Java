package numberofislands;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {

	private NumberOfIslands numberOfislands = new NumberOfIslands();
	
	
	@Test
	void test_1() {
		assertEquals(1, numberOfislands.numIslands(
				new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}));
	}
	
	@Test
	void test_2() {
		assertEquals(3, numberOfislands.numIslands(
				new char[][] {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}));	
	}

	

}
