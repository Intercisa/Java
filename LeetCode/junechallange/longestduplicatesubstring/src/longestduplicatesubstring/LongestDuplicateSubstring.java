package longestduplicatesubstring;

import java.util.HashSet;

public class LongestDuplicateSubstring {

	public String longestDupSubstring(String S) {
		int n = S.length();
		// convert string to array of integers
		// to implement constant time slice
		int nums[] = new int[n];

		for (int i = 0; i < n; i++)
			nums[i] = S.charAt(i) - 'a';

		// base value for the rolling hash function
		int a = 26;
		// modulus value for the rolling hash function to avoid overflow
		long modulus = (long) Math.pow(2, 32);
		
		// binary search, L = repeating string length
		int left = 1, right = n;
		int mid;
		while(left != right) {
			mid = left + (right - left) /2;
			if(search(mid, a, modulus, n, nums) != -1)
				left = mid + 1;
			else right = mid;
		}
		int start = search(left - 1, a, modulus, n, nums);
		return start!= -1 ? S.substring(start, start+left - 1) : "";

	}

	private int search(int mid, int a, long modulus, int n, int[] nums) {
		  // compute the hash of string S[:L]
		  long h = 0;
		  for(int i = 0; i < mid; ++i) h = (h * a + nums[i]) % modulus;

		  // already seen hashes of strings of length L
		  HashSet<Long> seen = new HashSet<Long>();
		  seen.add(h);
		  // const value to be used often : a**L % modulus
		  long aL = 1;
		  for (int i = 1; i <= mid; ++i) aL = (aL * a) % modulus;

		  for(int start = 1; start < n - mid + 1; ++start) {
		    // compute rolling hash in O(1) time
		    h = (h * a - nums[start - 1] * aL % modulus + modulus) % modulus;
		    h = (h + nums[start + mid - 1]) % modulus;
		    if (seen.contains(h)) return start;
		    seen.add(h);
		  }
		  return -1;
	}

}
