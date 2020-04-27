package maximalsquare;

public class MaximalSquare {

	//dynamic programming solution
	
	  public int maximalSquare(char[][] matrix) {
		  if(matrix == null || matrix.length == 0) return 0;  
		  
	      int rows = matrix.length, columns = matrix[0].length;
	      int[][]dp = new int[rows+1][columns+1]; 

	      int max = 0;
	      for (int i = 1; i <= rows; i++) {
	    	for (int j = 1; j <= columns; j++) {
				if (matrix[i-1][j-1] == '1') {
					dp[i][j] = Math.min(dp[i - 1][j - 1], 
							Math.min(dp[i-1][j], dp[i][j-1])) +1; //+1 is himself -> matrix[i-1][j-1] == '1'
					
					max = Math.max(max, dp[i][j]); //pick the biggest number that can form a square 
				}
			}
	      }
		  return max*max;
		  
	    }
}


/*	
 *  we always consider dp[i][j] as up left corner, and we check the 3 neighbor ->  dp[i-1][j], dp[i][j-1] and himself + 1 
 *  because if just one of them 0 then they can't form a square bigger than 1 
 *  if all the neighbors are 1-s and dp[i][j] is 1 than min is 1 and +1 -> 2 -> we have a square 2*2 
 *  we progress further and check if there is more ones to make a bigger square   
 * 
*/