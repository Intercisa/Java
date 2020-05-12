package main;

import sortbyparity.SortByParity;

/*
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * 
 */

public class Main {

	public static void main(String[] args) {
		SortByParity sortParity = new SortByParity();
		int[] res = sortParity.sortArrayByParity(new int[] {3,1,2,4});
		for (int i : res) 
			System.out.print(i+ " ");
	}
}
