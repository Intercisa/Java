package wordsearch;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		boolean res = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(dfs(board, word, i, j, 0)) res = true;
			}
		}
		return res;
	}

	private boolean dfs(char[][] board, String word, int i,int j, int curr) {
		if(i >= board.length || i < 0 || j >= board[0].length || j < 0) return false;
		
		if(board[i][j] == word.charAt(curr)) {
			char temp = board[i][j];
			board[i][j] = '#';
			if(curr == word.length()-1) return true;
			else if(
					dfs(board, word, i-1, j, curr+1) ||
					dfs(board, word, i, j-1, curr+1) ||
					dfs(board, word, i+1, j, curr+1) ||
					dfs(board, word, i, j+1, curr+1)) return true; 
			board[i][j] = temp; // backtrack
		}
		return false;
	}
}
