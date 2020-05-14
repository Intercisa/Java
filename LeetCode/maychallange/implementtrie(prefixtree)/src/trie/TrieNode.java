package trie;

public class TrieNode {
	   TrieNode[] child;
	    boolean isWord;

	    public TrieNode() {
	    	  isWord = false;
	          child = new TrieNode[26];
	    }

}
