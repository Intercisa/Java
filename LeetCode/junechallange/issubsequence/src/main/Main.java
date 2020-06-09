package main;

/*
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. 
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times)
 * with the following restrictions:
 * 	
 * 	You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * 	After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 * 
 * There are three states, according to the action that you can take.
 * Hence, from there, you can now the profit at a state at time i as:
 * s0[i] = max(s0[i - 1], s2[i - 1]); // Stay at s0, or rest from s2  
 * 		//can buy, ie, we have no stock now, and the max profit should be ''last no stock profit'' or ''last rest profit''
 * 
 * s1[i] = max(s1[i - 1], s0[i - 1] - prices[i]); // Stay at s1, or buy from s0     
 * 		//can sell, ie, we now have stock, and the profit should be ''last stock profit'' or ''last no stock but buy this time'' 
 * 
 * s2[i] = s1[i - 1] + prices[i]; // Only one way from s1  //we should sell then take a rest
 * 
 * Then, you just find the maximum of s0[n] and s2[n], since they will be the maximum profit we need
 * (No one can buy stock and left with more profit that sell right :) )
 *
 * Define base case:
 *
 * s0[0] = 0; // At the start, you don't have any stock if you just rest
 * s1[0] = -prices[0]; // After buy, you should have -prices[0] profit. Be positive!
 * s2[0] = INT_MIN; // Lower base case
 *
 */

public class Main {

	public static void main(String[] args) {
		
	}
}
