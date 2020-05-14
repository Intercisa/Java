package trie;

public class Trie {
	
	private TrieNode root;

    public Trie() {
    	root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    	if (isNotValid(word)) return;
    	
    	TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.child[c-'a'] == null) {
                node.child[c-'a'] = new TrieNode();
            }
            node = node.child[c-'a'];
        }
        node.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	TrieNode node = root;
        if (isNotValid(word)) return false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.child[c-'a'] == null) 
                return false;
            
            node = node.child[c-'a'];
        }
        return node.isWord;
    }
    

	/** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	 TrieNode node = root;
         if (isNotValid(prefix)) return false;
         
         for (int i = 0; i < prefix.length(); i++) {
             char c = prefix.charAt(i);
             if (node.child[c-'a'] == null) 
                 return false;
             
             node = node.child[c-'a'];
         }
         return true;
    }

	private boolean isNotValid(String prefix) {
		return prefix == null || prefix.length() == 0;
	}
	
}



