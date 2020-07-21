package wordsearch;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class WordSearchTest {
	private final char[][] BOARD = new char[][] {{'A','B','C','E'},
											   {'S','F','C','S'},
											   {'A','D','E','E'}};
	
	@Test
	void test_1() {
		assertTrue(new WordSearch().exist(BOARD, "ABCCED"));
	}
	
	@Test
	void test_2() {
		//assertTrue(new WordSearch().exist(BOARD, "SEE"));
	}
	@Test
	void test_3() {
		//assertFalse(new WordSearch().exist(BOARD, "ABCB"));
	}
}
