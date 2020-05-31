package editdistance;

public class EditDistance {

	public int minDistance(String word1, String word2) {

		int m = word1.length();
		int n = word2.length();

		int[][] dpTable = new int[m + 1][n + 1];

		// Fill dpTable[][] in bottom up manner 
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if(i == 0) dpTable[i][j] = j; // Min. operations = j
				
				// If second string is empty, only option is to 
                // remove all characters of second string 
				else if(j == 0) dpTable[i][j] = i; // Min. operations = i 
				
			    // If last characters are same, ignore last char 
                // and recur for remaining string 
				else if(word1.charAt(i - 1 ) == word2.charAt(j - 1)) dpTable[i][j] = dpTable[i - 1][j - 1];
				
				else
					dpTable[i][j] = 1 + Math.min(dpTable[i][j - 1], //Insert
										Math.min(dpTable[i - 1][j], //Remove
												 dpTable[i - 1][j - 1])); //Replace
			}
		}
		return dpTable[m][n];
	}

}

