package wordbreakII;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class WordBreakTest {

	@Test
	void test_1() {
		assertEquals(List.of("cats and dog","cat sand dog"), new WordBreak().wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog")));
	}
	
	@Test
	void test_2() {
		//assertEquals(List.of("pine apple pen apple", "pineapple pen apple","pine applepen apple"), new WordBreak().wordBreak("pineapplepenapple", List.of("apple", "pen", "applepen", "pine", "pineapple")));
	}
	
	@Test
	void test_3() {
		//assertEquals(null, new WordBreak().wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
	}
}
