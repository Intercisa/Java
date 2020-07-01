package arrangingcoins;

public class ArrangingCoins {

	public int arrangeCoinsMathSolution(int n) {
		/*
		 * The idea is about quadratic equation, the formula to get the sum of
		 * arithmetic progression is sum = (x + 1) * x / 2 so for this problem, if we
		 * know the the sum, then we can know the x = (-1 + sqrt(8 * n + 1)) / 2
		 * 
		 * n = (x + 1) * x / 2
		 * x² + x = 2*n
	     * x² + x + 1/4 - 1/4 = 2*n
		 * (x + 1/2)² = 2*n + 1 / 4
		 * (x + 1/2)² = (8*n + 1) / 4
		 * x + 1/2 = sqrt(8*n + 1) / 2
		 * x = (sqrt(8*n + 1) / 2) - (1 / 2)
		 * x = (sqrt(8*n + 1) - 1) / 2
		 * 
		 */

		return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
	}

	public int arrangeCoins(int n) {
		int left = 0;
		int right = n;
		long k;

		long curr;
		while (left <= right) {
			k = left + (right - left) / 2;
			curr = k * (k + 1) / 2;

			if (curr == n) return (int) k;

			if (n < curr) right = (int) k - 1;
			else left = (int) k + 1;

		}
		return right;
	}

	public int arrangeCoinsNaive(int n) {
		int count = 0, res = 0;
		while (count < n) {
			n -= ++count;
			res++;
		}
		return res;
	}
}
