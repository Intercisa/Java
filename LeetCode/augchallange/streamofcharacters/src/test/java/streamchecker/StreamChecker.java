package streamchecker;

import trie.Trie;

public class StreamChecker {
    private Trie trie = new Trie();

    public StreamChecker(String[] words) {
        trie.insert(words);
    }

    public boolean query(char letter) {
        return trie.query(letter);
    }
}
