package main;

import productofarrayexceptself.ProductOfArrayExceptSelf;

/*
 * Given an array nums of n integers where n > 1,  
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 */

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4};
		ProductOfArrayExceptSelf productOf = new ProductOfArrayExceptSelf();
		int[] output = productOf.productExceptSelf(arr);
		
		for (int i : output) {
			System.out.println(i);
		}

	}
}
