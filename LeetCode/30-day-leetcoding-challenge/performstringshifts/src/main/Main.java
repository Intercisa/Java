package main;

import performstringshifts.PerformStringShifts;

public class Main {

	public static void main(String[] args) {
		
		//direction can be 0 (for left shift) or 1 (for right shift). 
		
		String input = "abcdefg";
		int arr[][] = new int[][] {{1,1},{1,1},{0,2},{1,3}};  
		
		PerformStringShifts shifts = new PerformStringShifts();
		System.out.println(shifts.stringShift(input, arr));
		
		
		String input2 = "abc";
		int arr2[][] = new int[][] {{0,1},{1,2}};  
		System.out.println(shifts.stringShift(input2, arr2));
		
		String input3 = "xqgwkiqpif";
		int arr3[][] = new int[][] {{1,4},{0,7},{0,8},{0,7},{0,6},{1,3},{0,1},{1,7},{0,5},{0,6}};  
		System.out.println(shifts.stringShift(input3, arr3));
		
		
		String input4 = "wpdhhcj";
		int arr4[][] = new int[][] {{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}};  
		System.out.println(shifts.stringShift(input4, arr4));
		

	}
}
