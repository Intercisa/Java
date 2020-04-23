package main;

import bitwiseANDofnumbersrange.BitwiseAndOfNumbersRange;

/*
 *Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 */

public class Main {

	public static void main(String[] args) {
		
		BitwiseAndOfNumbersRange bitwiseAndOfNumbersRange = new BitwiseAndOfNumbersRange();
		System.out.println(bitwiseAndOfNumbersRange.rangeBitwiseAnd(5, 7));
		

	}
}
