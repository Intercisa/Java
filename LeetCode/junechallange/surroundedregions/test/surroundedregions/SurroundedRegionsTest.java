package surroundedregions;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SurroundedRegionsTest {

	@Test
	void test_1() {

		char[][] inputMatrix = new char[][] { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' } };

		char[][] outputMatrix = new char[][] { { 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'X' },
				{ 'X', 'O', 'X', 'X' } };
				
		assertArrayEquals(outputMatrix, new SurroundedRegions().solve(inputMatrix));

	}
	
	
	@Test
	void test_2() {

		char[][] inputMatrix = new char[][] {{'O', 'O'}, {'O', 'O'}};

		char[][] outputMatrix = new char[][] {{'O', 'O'}, {'O', 'O'}};
				
		assertArrayEquals(outputMatrix, new SurroundedRegions().solve(inputMatrix));

	}
	
	
	@Test
	void test_3() {

		char[][] inputMatrix = new char[][] {{'O', 'O', 'O'}, {'O', 'O', 'O'}, {'O', 'O', 'O'}};

		char[][] outputMatrix = new char[][] {{'O', 'O', 'O'}, {'O', 'O', 'O'}, {'O', 'O', 'O'}};
				
		assertArrayEquals(outputMatrix, new SurroundedRegions().solve(inputMatrix));

	}
	
	
	@Test
	void test_4() {

		char[][] inputMatrix = new char[][] {{'X', 'O', 'X'}, {'X', 'O', 'X'}, {'X', 'O', 'X'}};

		char[][] outputMatrix = new char[][] {{'X', 'O', 'X'}, {'X', 'O', 'X'}, {'X', 'O', 'X'}};
				
		assertArrayEquals(outputMatrix, new SurroundedRegions().solve(inputMatrix));

	}


}
