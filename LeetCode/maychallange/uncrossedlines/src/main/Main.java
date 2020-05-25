package main;

/*
 * 
 * We write the integers of A and B (in the order they are given) on two separate horizontal lines.
 * Now, we may draw connecting lines: a straight line connecting two numbers A[i] and B[j] such that:
 *   A[i] == B[j];
 *   The line we draw does not intersect any other connecting (non-horizontal) line.
 * Note that a connecting lines cannot intersect even at the endpoints: each number can only belong to one connecting line.
 * Return the maximum number of connecting lines we can draw in this way.
 * 
 * 
 * dp[i+1][j+1] = max( dp[i+1][j], dp[i][j+1] )         if A[i] != B[j]
 *             1 + dp[i][j]                             if A[i] == B[j]
 * dp[0][0] = 0
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
	}
}
