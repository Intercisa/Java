package main;

import leftmostcolumnwithone.LeftMostColumnWithOne;
import leftmostcolumnwithone.Matrix;

/*A binary matrix means that all elements are 0 or 1. 
 *For each individual row of the matrix, this row is sorted in non-decreasing order.
 *Given a row-sorted binary matrix binaryMatrix, 
 *return leftmost column index(0-indexed) with at least a 1 in it. If such index doesn't exist, return -1.
 * 
 *  2. (Optimal Approach) Imagine there is a pointer p(x, y) starting from top right corner. 
 *  p can only move left or down. If the value at p is 0, move down. If the value at p is 1, move left. 
 *  Try to figure out the correctness and time complexity of this algorithm.
 */

public class Main {

	public static void main(String[] args) {

		 int[][] testMatrixArr_1 = new int[][]{{0,0},{1,1}};
		 Matrix matrix = new Matrix(testMatrixArr_1);
		
		LeftMostColumnWithOne leftMostColumnWithOne = new LeftMostColumnWithOne();
		System.out.println(leftMostColumnWithOne.leftMostColumnWithOne(matrix));
		

	}
}
