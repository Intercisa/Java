package twocityscheduling;

import java.util.Arrays;
import java.util.Comparator;

//greedy algorithm
public class TwoCityScheduling {
	public int twoCitySchedCost(int[][] costs) {
		Comparator<int[]> comparator = (a, b) -> a[0] - a[1] - (b[0] - b[1]);
		Arrays.sort(costs, comparator);
		int N = costs.length / 2;
		int ans = 0;

		for (int i = 0; i < N; ++i) 
			ans += costs[i][0] + costs[i + N][1];

		return ans;
	}
	
	
	
	//dynamic programming solution
	
	public int twoCitySchedCostDP(int[][] costs) {
        int N = costs.length / 2;
        int[][] dp = new int[N + 1][N + 1];
        
        for (int i = 1; i <= N; i++) 
            dp[i][0] = dp[i - 1][0] + costs[i - 1][0];

        
        for (int j = 1; j <= N; j++) 
            dp[0][j] = dp[0][j - 1] + costs[j - 1][1];

            for (int i = 1; i <= N; i++) {
	            for (int j = 1; j <= N; j++) {
	                dp[i][j] = Math.min(dp[i - 1][j] + costs[i + j - 1][0], dp[i][j - 1] + costs[i + j - 1][1]);
	            }
	        }
        return dp[N][N];
}
}