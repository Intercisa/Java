package main;

import productofarrayexceptself.ProductOfArrayExceptSelf;

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
