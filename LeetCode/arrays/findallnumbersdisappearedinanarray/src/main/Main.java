package main;

/*
 * 
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * 
 *  mark elements as negative using nums[nums[i] -1] = -nums[nums[i]-1]. 
 *  at the end if a value is not marked as negative, it implies we have never seen that index before, so just add it +1 to the return list.
 */

public class Main {

	public static void main(String[] args) {
	}
}
