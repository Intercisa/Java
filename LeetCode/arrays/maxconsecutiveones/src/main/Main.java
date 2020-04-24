package main;

import ones.MaxConsecutiveOnes;

//Given a binary array, find the maximum number of consecutive 1s in this array.

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,1,0,1,1,1};
		MaxConsecutiveOnes maxOnes = new MaxConsecutiveOnes();
		System.out.println(maxOnes.findMaxConsecutiveOnes(arr));
		
		
	}

	
}
