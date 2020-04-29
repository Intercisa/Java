package main;

import binarytreemaximumpathsum.BinaryTreeMaximumPathSum;
import binarytreemaximumpathsum.TreeNode;

public class Main {

	/*
	 *Given a non-empty binary tree, find the maximum path sum.
	  For this problem, a path is defined as any sequence of nodes 
	  from some starting node to any node in the tree along the parent-child connections. 
	  The path must contain at least one node and does not need to go through the root.
	 */
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		BinaryTreeMaximumPathSum pathSum = new BinaryTreeMaximumPathSum();
		System.out.println(pathSum.maxPathSum(root));
		
	}
}
