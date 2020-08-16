package main.java.buyandsell;

// explanation: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/discuss/135704/Detail-explanation-of-DP-solution

public class BuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int totalTransaction = 2;
        int[][] dp = new int[totalTransaction+1][prices.length];

        for(int k = 1;k<=totalTransaction;k++){//profit = 0 when k = 0
            for(int i = 1;i< prices.length;i++){
                int maxProfitSellOnCurrantDay = Math.max(0,prices[i] - prices[0]);//buy on day 0, sell on day i
                for(int j = 1;j<i;j++){//buy on day j, sell on day i
                    maxProfitSellOnCurrantDay = Math.max(maxProfitSellOnCurrantDay,dp[k-1][j-1] + prices[i] - prices[j]);
                }
                dp[k][i] = Math.max(dp[k][i-1],maxProfitSellOnCurrantDay);//sell on day i OR not
            }
        }
        return dp[totalTransaction][prices.length-1];
    }
}
