package main;

/*
 * Dynamic Programming
 * 
 * Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
 * 
 * directly accumulate in the original matrix
 * 
 * 0 | 1 1 1 -> 0 1 1 1  res 3
 * 
 * 1 | 1 1 1 -> 1 1 2 2  res 9
 * 
 * 0 | 1 1 1 -> 0 1 2 3  res 15
 * 
 * if i == 0 || j == 0 -> borders >> count++
 * 
 * matrix[i][j] += min
 * count+= matrix[i][j]
 * 
 * time complexity O(mXn)
 * 
 */

public class Main {

	public static void main(String[] args) {
	
	}
}
