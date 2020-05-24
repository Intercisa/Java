package main;

import constructbinarysearchtreefrompreordertraversal.ConstructBinarySearchTreefromPreorderTraversal;
import constructbinarysearchtreefrompreordertraversal.TreeNode;

/*
	Return the root node of a binary search tree that matches the given preorder traversal.
	(Recall that a binary search tree is a binary tree where for every node, 
	 any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val. 
	Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
 */

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[] {8,5,1,7,10,12};
		
		ConstructBinarySearchTreefromPreorderTraversal binarySearchTreefromPreorderTraversal =
														new ConstructBinarySearchTreefromPreorderTraversal();
		
		TreeNode head = binarySearchTreefromPreorderTraversal.bstFromPreorder(arr);
		TreeNode.printInorder(head);
		

	}
}
