package coinchange2;

import java.util.Arrays;

public class CoinChange2 {
	
	//dp second	 - only one dimension
	public int change(int amount, int[] coins) {

        int dp[] = new int[amount+1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        
        for(int coin:coins){
            for(int j = coin; j<=amount; j++){
            dp[j] += dp[j - coin];
            }
        }
            return dp[amount];
    }
	
	//dp first
	public int change2(int amount, int[] coins) {

		int[][] dp = new int[coins.length + 1][amount + 1];

		for (int i = 0; i <= coins.length; i++) dp[i][0] = 1;

		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= amount; j++) {
				if (coins[i - 1] <= j)
					dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
				else
					dp[i][j] = dp[i - 1][j];
			}
		}
		return dp[coins.length][amount];
	}
	
	
	//recursive
	public int changeNaive(int amount, int[] coins) {
		return changeNaiveHelper(amount, coins, 0);
	}

	private int changeNaiveHelper(int amount, int[] coins, int index) {
		if (amount < 0) return 0;
		if (amount == 0) return 1;

		if (coins.length == index) return 0;

		return changeNaiveHelper(amount - coins[index], coins, index) + changeNaiveHelper(amount, coins, index + 1);
	}
}
