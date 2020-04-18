package minimumpathsum;

public class MinimumPathSum {
		//dynamic programming approach
	/*
	 * The basic idea is that the minimum path sum at point map[i][j] is the minimum between 
	 * map[i][j]+map[i-1][j] and map[i][j]+map[i][j-1] 
	 * where map was identical to the given grid at its initialization stage.
	 * 
	 * there is a more understandable solution in other_soulitions.txt for CPP (easy to implement for Java as well)
	 */
	
	  public int minPathSum(int[][] grid) {
	      
		  if(grid == null || grid.length == 0) return 0;

		  int[][] mapper  = grid;
		  int rows = grid.length;
		  int columns = grid[0].length;
		  
		  
		  for (int i = 0; i < rows; i++) { 
			  if (i > 0)
				  mapper[i][0] += mapper[i-1][0];
		  	for (int j = 1; j < columns; j++) {
		  		if(i == 0 && j > 0)
		  			mapper[i][j] += mapper[i][j-1];
		  		else
		  			mapper[i][j] += Math.min(mapper[i][j - 1], mapper[i-1][j]);
		  	}
		  }	
		  
		  return mapper[rows-1][columns-1];
	    }
}

