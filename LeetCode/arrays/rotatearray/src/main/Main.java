package main;

import rotatearray.RotateArr;

/*
 * 
 *Given an array, rotate the array to the right by k steps, where k is non-negative.
 *Follow up: 
 *Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 *Could you do it in-place with O(1) extra space?
 *
 *
 *let a= [1,2,3,4,5,6,7]
 *	k = 3.
 *
 * in place: 
 * 	we have to first reverse the whole array by swapping first element with the last one and so on..
 *		you will get[7,6,5,4,3,2,1]
 *
 * reverse the elements from 0 to k-1
 *	reverse the elements 7,6,5
 *	    you will get [5,6,7,4,3,2,1]
 *
 * reverse the elements from k to n-1
 *	reverse the elements 4,3,2,1
 *		you will get[5,6,7,1,2,3,4]
 *
 *
 *
 * with puls array
 *
 * Rotate right (for positive n):
 * 
 * for(int i = 0; i < data.length; i++){
 *   result[(i+n) % data.length ] = data[i];
 *  }
 *
 * Rotate left (for positive n):
 * 
 * for(int i = 0; i < data.length; i++){
 *   result[(i+(data.length-n)) % data.length ] = data[i];
 *  }
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		RotateArr rotate = new RotateArr();
		rotate.rotate(new int[] {1,2,3,4,5,6,7}, 3);
	}
}
