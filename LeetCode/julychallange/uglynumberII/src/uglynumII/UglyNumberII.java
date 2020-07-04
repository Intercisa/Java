package uglynumII;

/*
 * dynamic programming : overlapping subproblems
 * 
 * 1*2, 2*2, 3*2, 4*2, ...
 * 1*3, 2*3, 3*3, 4*3, ...
 * 1*5, 2*5, 3*5, 4*5, ...
 *
 *
 * 1*2, 1*3, 2*2, 1*5, 2*3, 3*3, 2*5, ...
 * 
 * explanation: https://interviewprep.appliedcourse.com/lecture/2/interview-preparation-course/496/nth-ugly-number/0/free-videos
 * 
 */

public class UglyNumberII {
	public int nthUglyNumber(int n) {
		if(n == 1) return 1;
		
		int[] dp = new int[n];
		int u2 = 0, u3 = 0, u5 = 0;
		int next = 0;
		
		dp[0] = 1;
		
		for (int i = 1; i < n; i++) {
			next = Math.min(dp[u2] * 2, Math.min(dp[u3] * 3, dp[u5] * 5));
			dp[i] = next;
			
			if(next == dp[u2]* 2) u2 = u2+1;
			if(next == dp[u3]* 3) u3 = u3+1;
			if(next == dp[u5]* 5) u5 = u5+1;
		}
		return next;
	}
}
