package main.java.trie;

public class TrieNode {
    TrieNode[] children;
    boolean isWord;

    TrieNode(){
        isWord=false;
        children = new TrieNode[26];
    }
}
