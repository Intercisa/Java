package dungeon;

public class DungeonGame {
	//https://leetcode.com/problems/dungeon-game/discuss/192590/My-intuitive-dp-solution-with-text-and-video-explanation.
	
	//https://www.programcreek.com/2014/03/leetcode-dungeon-game-java/
	public int calculateMinimumHP(int[][] dungeon) {
		if(dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) return 1;
		
		int m = dungeon.length;
		int n = dungeon[0].length;
	 
		//init dp table
		int[][] dp = new int[m][n];
	 
		dp[m - 1][n - 1] = Math.max(1 - dungeon[m - 1][n - 1], 1);
	 
		//init last row
		for (int i = m - 2; i >= 0; i--) 
			dp[i][n - 1] = Math.max(dp[i + 1][n - 1] - dungeon[i][n - 1], 1);
		
	 
		//init last column
		for (int j = n - 2; j >= 0; j--) 
			dp[m - 1][j] = Math.max(dp[m - 1][j + 1] - dungeon[m - 1][j], 1);
		
	 
		//calculate dp table
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				int down = Math.max(dp[i + 1][j] - dungeon[i][j], 1);
				int right = Math.max(dp[i][j + 1] - dungeon[i][j], 1);
				dp[i][j] = Math.min(right, down);
			}
		}
	 
		return dp[0][0];
		
	}
}
