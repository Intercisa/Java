package main;

import movezeros.MoveZeros;

/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 */

public class Main {

	public static void main(String[] args) {
		MoveZeros moveZeros = new MoveZeros();
		int[] res = moveZeros.moveZeroes(new int[] {1,4,0,1,0});
		for (int i : res) 
			System.out.print(i+ " ");
	}
}
