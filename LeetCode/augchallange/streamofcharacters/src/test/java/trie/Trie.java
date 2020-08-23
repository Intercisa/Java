package trie;

public class Trie {
    private TrieNode root;
    private StringBuilder sb;
    public Trie(){
        root = new TrieNode();
        sb = new StringBuilder();
    }

    public void insert(String[] words){
        for (String word : words) insert(word);
    }

    public void insert(String word){
        TrieNode node = root;
        int len = word.length();
        for (int i = len - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null) node.children[c - 'a'] = new TrieNode();

            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean query(char letter){
        sb.append(letter);
        TrieNode node = root;
        for (int i = sb.length() - 1; i >= 0 && node != null; i--) {
            char c = sb.charAt(i);
            node = node.children[c - 'a'];
            if (node != null && node.isWord) return true;
        }
        return false;
    }

}
