package trie;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TrieTest {
	private Trie trie = new Trie();
		
	@Test
	void test_1() {
		trie.insert("apple");
		assertEquals(true, trie.search("apple"));
		assertEquals(false, trie.search("app"));
		assertEquals(true, trie.startsWith("app"));
		trie.insert("app");
		assertEquals(true, trie.search("app"));
	
	}
}
