package countsquaresubmatrices;

public class CountSquareSubmatriceswithAllOnes {
	public int countSquares(int[][] matrix) {

		int m = matrix.length;
		
		if (m == 0)
			return 0;
		
		
		 //we could use a dpTable -> int[][] dpTable = new int[m][n]; but don't have to so we use the original matrix instead 
	
		
		int n = matrix[0].length;
		int count = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
		
				if(matrix[i][j] == 1){
					
					if(i == 0 || j == 0)
						matrix[i][j] = 1;
					
					else
						matrix[i][j] = Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1]) + 1;
				
					count+=matrix[i][j];
					
					/* with dpTable:
					 * dpTable[i][j] = Math.min(Math.min(dpTable[i-1][j], dpTable[i][j-1]), dpTable[i-1][j-1]) + 1;
                     * count+=dpTable[i][j];
					 */
					
					
				}
			}
		}

		return count;
	}
}
