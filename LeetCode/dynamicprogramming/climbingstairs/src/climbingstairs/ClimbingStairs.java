package climbingstairs;

public class ClimbingStairs {

	public int climbStairs(int n) {

		if (n == 1 || n == 2)return n;

		int[] dpTable = new int[n + 1];

		dpTable[0] = 0;
		dpTable[1] = 1;
		dpTable[2] = 2;

		for (int i = 3; i <= n; i++)
			dpTable[i] = dpTable[i - 1] + dpTable[i - 2];

		return dpTable[n];

	}

}
