package sellstock;

//Simple One Pass

//[7,1,5,3,6,4]

public class SellStock {
public int maxProfit(int[] prices) {
	int n = prices.length;
	int diff = 0;
	for (int i = 1; i < n; i++) {
	
		if(prices[i] > prices[i-1]) {
			//debug
			System.out.println("prices[i]: "+ prices[i]);
			System.out.println("prices[i-1]: "+ prices[i-1]);
			
			diff+=prices[i]-prices[i-1];
		}
	}
        return diff;
    }

}


/*
 * just as good as:
 * 
 *     int result = 0;
        for(int i=0; i<prices.length-1; i++)
        {
            if(prices[i] <prices[i+1])
            {
                result += prices[i+1] - prices[i];
            }
        }
        return result;
 * 
 * 
 * 
 * 
 * 
 */

/*
 * Kotlin solution:
 * 
 * class Solution {
    fun maxProfit(prices: IntArray): Int {
    
    var diff:Int = 0
        
    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) {
            ans += prices[i] - prices[i - 1]
        }
    }
    return ans
}
}
 * 
 * 
 */



//Peak Valley Approach >> https://medium.com/@punitkmr/best-time-to-buy-and-sell-stock-ii-7826845144eb

/*
 * 
 * 
    class Solution {    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
}
 * 
 * 
 * 
 * 
 * 
*/
