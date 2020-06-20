package permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PermutationSequence {
	public String getPermutation(int n, int k) {
		String res = "";
		ArrayList<Integer> numList = IntStream.range(1, n + 1)
				.collect(ArrayList::new, List::add, List::addAll);

		// change k to be index
		k--;

		// set factorial of n
		int mod = 1;
		for (int i = 1; i <= n; i++) mod *= i;

		// find sequence
		for (int i = 0; i < n; i++) {
			mod = mod / (n - i);
			// find the right number(curIndex) of
			int curIndex = k / mod;
			// update k
			k %= mod;

			// get number according to curIndex
			res += numList.get(curIndex);
			// remove from list
			numList.remove(curIndex);
		}
		return res;
	}
}
