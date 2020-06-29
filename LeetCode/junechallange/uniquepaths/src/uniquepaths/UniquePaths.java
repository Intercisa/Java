package uniquepaths;

public class UniquePaths {
	
	
	public int uniquePaths(int m, int n) {
		int[] dp = new int[n];
		dp[0] = 1;
		
		for (int i = 0; i < m; i++) {			
			for (int j = 1; j < n; j++) 
				dp[j] += dp[j -1];
		}
		
		return dp[n - 1];
	}
	
	public int uniquePathsII(int m, int n) {
	    int[][] tab = new int[m][n];
	    
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            if(i==0 || j==0) tab[i][j] = 1;
	            else
	                tab[i][j] = tab[i-1][j]+tab[i][j-1];
	        }
	    }
	    
	    return tab[m-1][n-1];
	}
	
	
	public int uniquePathsIII(int m, int n) {
		
		int[][] dp = new int[m][n];
		
	     // When (n==0|| m==0) the function always returns 1 since the robot can't go left or up.
		// Therefore populate the edges with 1
		for (int i = 0; i < m; i++) dp[i][0] = 1;
		
	     // Count of paths to reach any cell in 
        // first column is 1 
		for (int j = 0; j < n; j++) dp[0][j] = 1;
		
		
		 // Calculate count of paths for other 
        // cells in bottom-up manner using 
        // the recursive solution 
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j]+ dp[i][j -1]; //+ count[i-1][j-1];  -> If diagonal movements are allowed
			}
		}
			
		return dp[m - 1][n - 1];
	}
	
	
	public int uniquePathsDfs(int m, int n) {
	    return dfs(0,0,m,n);
	}
	 
	public int dfs(int i, int j, int m, int n){
	    if(i==m-1 && j==n-1) return 1;
	 
	    if(i<m-1 && j<n-1) return dfs(i+1,j,m,n) + dfs(i,j+1,m,n);
	 
	    if(i<m-1) return dfs(i+1,j,m,n);
	 
	    if(j<n-1) return dfs(i,j+1,m,n);

	 
	    return 0;
	}
	
	
	public int uniquePathsRecursive(int m, int n) {
		
		 // If either given row number is first or 
        // given column number is first 
		if(m == 1 || n == 1) return 1;
		
		// If diagonal movements are allowed then 
        // the last addition is required. 
		return uniquePaths(m-1, n) + uniquePaths(m, n-1);
		// + numberOfPaths(m-1, n-1); 
	}
}
