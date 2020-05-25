package uncrossedlines;

public class UncrossedLines {
	//dynamic programming 
	   public int maxUncrossedLines(int[] A, int[] B) {
	       int m = A.length, n = B.length;
		   
		   int[][]dpTable = new int[m+1][n+1];
		   
		   for (int i = 1; i <=m; i++) {
			for (int j = 1; j <= n; j++) {
				if(A[i-1] == B[j-1])
					dpTable[i][j] = 1 + dpTable[i - 1][j - 1];
				else
					dpTable[i][j] = Math.max(dpTable[i][j-1],dpTable[i-1][j]);
			}
		}
		   return dpTable[m][n];
	    }
}
