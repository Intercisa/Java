package main;

/*
 * 
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], 
 * and the cost of flying the i-th person to city B is costs[i][1].
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 * 
 * 
 *   1 <= costs.length <= 100
 *   It is guaranteed that costs.length is even.
 *   1 <= costs[i][0], costs[i][1] <= 1000
 *   
 *  Basic Ideas: greedy
 *  Get the absolute difference for each person
 *  Start to settle down with persons whos difference are bigger
 *  Complexity: Time O(n*log(n)), Space O(1)
 * 
 * explanation: https://massivealgorithms.blogspot.com/2019/06/leetcode-1029-two-city-scheduling.html 
 */

public class Main {

	public static void main(String[] args) {
	}
}
