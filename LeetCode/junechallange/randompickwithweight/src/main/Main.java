package main;

/*
 * Given an array w of positive integers, where w[i] describes the weight of index i,
 * write a function pickIndex which randomly picks an index in proportion to its weight.
 * 
 * The problem is, we need to randomly pick an index proportional to its weight.
 * What this means? 
 * We have weights array, each
 * weights[i]  represents weight of index i. 
 * The more the weight is, then high chances of getting that index randomly.
 * suppose weights = [1, 3]
 * then 3 is larger, so there are high chances to get index 1.
 * We can know the chances of selecting each index by knowing their probability.
 * 
 * P(i) = weight[i]/totalWeight
 * totalWeight = 1 + 3 = 4
 * So, for index 0, P(0) = 1/4  = 0.25 = 25%
 * for index 1, P(1) = 3/4 = 0.75 = 75%
 * 
 * So, there are 25% of chances to pick index 0 and 75% chances to pick index 1.
 *
 *
 * for the array of {1, 3, 4, 6}
 * the pickIndex() call will have 1/(1+3+4+6) =
 * 			 1/14 = ~7% chance of picking index 0; 
 * 	         3/14 = 21% change of picking index 1; 
 * 			 4/14 = 29% change of picking index 2; 
 * 			 6/14 = 43% of picking index 3.
 *
 *
 * Solution: 
 * [1,2,3]->{1:0, 3:1, 6:2}
 * Say if rnd=4, it should return 2, because ceiling(4)=6 or higherMap in our map, whose corresponding index is 2.
 * 
 * 
 * Solution2: 
 *  say we have the numbers 1, 5, 2 easiest solution is to construct the following array
 *	arr[] = {0,1,1,1,1,1,2,2}
 *  then generate a random number between 0 and 7 and return the arr[rnd]. 
 *  This is solution is not really good though due to the space requirements it has (imagine a number being 2billion).
 *  The solution here is similar but instead we construct the following array (accumulated sum)
 *  {1, 6, 8} generate a number between 1-8 and say all numbers generated up to 1 is index 0. 
 *  all numbers generated greater than 1 and up to 6 are index 1 and all numbers greater than 6 and up to 8 are index 2. 
 *  After we generate a random number to find which index to return we use binary search.
 *
 *
 */

public class Main {

	public static void main(String[] args) {
		
	}
}
