package main;

import maximalsquare.MaximalSquare;

public class Main {

	//Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
	
	public static void main(String[] args) {
		char[][] arr = new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		MaximalSquare maximalSquare = new MaximalSquare();
		System.out.println(maximalSquare.maximalSquare(arr));
		
	}
}
