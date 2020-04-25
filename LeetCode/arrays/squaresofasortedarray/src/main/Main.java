package main;

import squaresorted.SquaresOfSortedArray;

/*
	Given an array of integers A sorted in non-decreasing order, 
	return an array of the squares of each number, also in sorted non-decreasing order.
 */

public class Main {

	public static void main(String[] args) {
		SquaresOfSortedArray squareSorted = new SquaresOfSortedArray();
		squareSorted.sortedSquares(new int[] {-4,-1,0,3,10});
	}
}
