package main.java.trie;

public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        if(isNotValid(word)) return;
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null) node.children[c - 'a'] = new TrieNode();
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word){
        TrieNode node = searchFor(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix){
        return searchFor(prefix) != null;
    }

    private TrieNode searchFor(String input){
        TrieNode node = root;
        if(isNotValid(input)) return null;
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(node.children[c - 'a'] == null) return null;

            node = node.children[c - 'a'];
        }
        return node;
    }

    // search with dots (.) -> a.. || .ad etc.
    public boolean search(String word, int index){
        return dfsSearch(root, word, index);
    }
    private boolean dfsSearch(TrieNode node, String word, int start){
        if(node.isWord && start == word.length()) return true;
        if(start >= word.length()) return false;

        char c = word.charAt(start);
        if (c == '.'){
           boolean tResult = false;
            for (int j = 0; j < 26; j++) {
                if (node.children[j] != null && dfsSearch(node.children[j], word, start + 1)) {
                    tResult = true;
                    break;
                }
            }
            return tResult;
        }else{
            int index = c - 'a';
            return node.children[index] != null && dfsSearch(node.children[index], word, start + 1);
        }
    }

    private boolean isNotValid(String prefix) {
        return prefix == null || prefix.length() == 0;
    }
}
