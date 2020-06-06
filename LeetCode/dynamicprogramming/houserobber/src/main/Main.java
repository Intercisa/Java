package main;

/*
 * 
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses 
 * have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, 
 * determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 * 
 *   Find recursive relation
 *   Recursive (top-down)
 *   Recursive + memo (top-down)
 *   Iterative + memo (bottom-up)
 *   Iterative + N variables (bottom-up)
 * 
 * 	Step 1. Figure out recursive relation.
 *		A robber has 2 options: a) rob current house i; b) don't rob current house.
 *		If an option "a" is selected it means she can't rob previous i-1 house but can safely proceed to the one before previous i-2 and gets all cumulative loot that follows.
 *		If an option "b" is selected the robber gets all the possible loot from robbery of i-1 and all the following buildings.
 *		So it boils down to calculating what is more profitable:
 *
 *   robbery of current house + loot from houses before the previous
 *   loot from the previous house robbery and any loot captured before that
 *
 *	 rob(i) = Math.max( rob(i - 2) + currentHouseValue, rob(i - 1) )
 * 
 */

public class Main {

	public static void main(String[] args) {
	}
}
