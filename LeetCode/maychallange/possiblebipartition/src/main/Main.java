package main;

/*
 * 
 * Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone into two groups of any size.
 * Each person may dislike some other people, and they should not go into the same group. 
 * Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people numbered a and b into the same group.
 * Return true if and only if it is possible to split everyone into two groups in this way.
 * 
 * This problem can be solved in two steps:
 *   Graph building. Apparently, there are N nodes in the graph and each node represents a person. 
 *   For any two person who dislikes each other, create a edge between the two nodes.
 *   Graph coloring. Each node in the group can be colored with 0 or 1 which denotes the group the person belongs to.
 *   The color of each node is initiated to -1. We traverse each node to color it and nodes that connected to current node. 
 *   For any edge in the graph, if the colors of its two nodes are equal, 
 *   then contradiction occurs which means we can not split these people in two groups. 
 *   Otherwise, we can split them in two groups.
 *   We use the dfs to color the graph.
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
	}
}
