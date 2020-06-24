package main;

/*
 * 
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 * 
 * Input: 3
 * Output: 5
 * Explanation:
 * Given n = 3, there are a total of 5 unique BST's:
 *
 *  1         3     3      2      1
 *   \       /     /      / \      \
 *    3     2     1      1   3      2
 *   /     /       \                 \
 *  2     1         2                 3
 * 
 * 
 *  For all possible values of i, consider i as root, 
 *  then [1….i-1] numbers will fall in the left subtree and [i+1….n] numbers will fall in the right subtree. 
 *  So, add (i-1)*(n-i) to the answer. The summation of the products will be the answer to the number of unique BST. 
 * 	https://www.programcreek.com/2014/05/leetcode-unique-binary-search-trees-java/
 * 
 */

public class Main {

	public static void main(String[] args) {
		
	}
}
