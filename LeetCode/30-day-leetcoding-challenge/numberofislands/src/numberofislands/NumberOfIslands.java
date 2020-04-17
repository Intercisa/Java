package numberofislands;


public class NumberOfIslands {
	 //Using Flood Fill algorithm:
	
	 public int numIslands(char[][] grid) {
		 if(grid == null || grid.length == 0 || grid[0].length==0) return 0; 
		 
		 int height = grid.length;
		 int length = grid[0].length;
		 
		 int count = 0;
		 
		 for (int i = 0; i < height; i++) {
			for (int j = 0; j < length; j++) {
				if(grid[i][j] == '1') {
					count++;
					merge(grid, i, j);
				} 
			}
		}
		 return count;
		 
	    }

	private void merge(char[][] grid, int i, int j) {
		int gridH = grid.length;
		int gridL = grid[0].length;
		
		if(i < 0 || i >= gridH || j < 0 || j >= gridL || grid[i][j] != '1') return;
		
		grid[i][j] ='X';
		
		merge(grid, i-1, j);
		merge(grid, i+1, j);
		merge(grid, i, j-1);
		merge(grid, i, j+1);
		
		
	}
	
	
}


