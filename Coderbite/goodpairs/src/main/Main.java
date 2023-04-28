package main;


import goodpairs.IsomorphicString;
import goodpairs.PivotIndex;
import goodpairs.RunningSum;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,3};
//		System.out.println(IdenticalPairs.numIdenticalPairs(arr));

		int[][] maxWealthArr = {
				{1,2,3},
				{3,2,1}
		};
//		System.out.println(MaximumWealth.maximumWealth(maxWealthArr));

//		System.out.println(Arrays.toString(RunningSum.runningSum(new int[]{3,1,2,10,1})));

		System.out.println(PivotIndex.pivotIndex(new int[] {1,7,3,6,5,6}));

//		System.out.println(IsomorphicString.isIsomorphic("foo", "bar"));
	}
}
