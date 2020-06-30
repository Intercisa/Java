package wordsearchII;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {
	public List<String> findWords(char[][] board, String[] words) {

		List<String> result = new ArrayList<String>();
	    TrieNode root = buildTrie(words);
	    for (int i = 0; i < board.length; i++) {
	        for (int j = 0; j < board[0].length; j++) {
	            dfs (board, i, j, root, result);
	        }
	    }
	    return result;
	}
	
	public void dfs(char[][] board, int i, int j, TrieNode p, List<String> result) {
	    char c = board[i][j];
	    if (c == '#' || p.next[c - 'a'] == null) return;
	    p = p.next[c - 'a'];
	    if (p.word != null) {   // found one
	    	result.add(p.word);
	        p.word = null;     // de-duplicate
	    }

	    board[i][j] = '#';
	    if (i > 0) dfs(board, i - 1, j ,p, result); 
	    if (j > 0) dfs(board, i, j - 1, p, result);
	    if (i < board.length - 1) dfs(board, i + 1, j, p, result); 
	    if (j < board[0].length - 1) dfs(board, i, j + 1, p, result); 
	    board[i][j] = c;
	}
	
	private TrieNode buildTrie(String[] words) {
		TrieNode root = new TrieNode();
		for (String w : words) {
			TrieNode p = root;
			for (char c : w.toCharArray()) {
				int i = c - 'a';
				if (p.next[i] == null)
					p.next[i] = new TrieNode();
					p = p.next[i];
			}
			p.word = w;
		}
		return root;
	}
}
