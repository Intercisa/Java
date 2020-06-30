package wordsearchII;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class WordSearchIITest {

	@Test
	void test_1() {
		char[][] board = {{'o','a','a','n'},
						  {'e','t','a','e'},
						  {'i','h','k','r'},
						  {'i','f','l','v'}};
		
		String[] words = {"oath","pea","eat","rain"};
		
		assertEquals(List.of("oath","eat"), new WordSearchII().findWords(board, words));
		
		
		
	}
}
