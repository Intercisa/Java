package main;

import movezeroes.Movezeroes;

/*
 * 
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {0,1,0,3,12};	
		Movezeroes movezeroes = new Movezeroes();
		movezeroes.moveZeroes(arr);

	}

}
