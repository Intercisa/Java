package main;

/*
 * 
 * Given a directed, acyclic graph of N nodes.
 * Find all possible paths from node 0 to node N-1, and return them in any order.
 * The graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1. 
 * graph[i] is a list of all nodes j for which the edge (i, j) exists.
 * 
 * 
 * Find all paths from a vertex u to vertex v.
 * There will be an exponential number of paths - O(2^n) paths
 * To generate all of these paths you need to use Backtracking:
 * 1. Go through every vertex's children (This is essentially picking a path)
 * 2. Then dfs() on that path to find if any of those children lead to your target vertex
 * 3. If they, do then add them to your answer list
 * Time Complexity: O(2^n), because there will be 2^n number of paths
 * Space Complexity: O(2^n), because you will need to return 2^n number of paths
 * 
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {
	}
}
