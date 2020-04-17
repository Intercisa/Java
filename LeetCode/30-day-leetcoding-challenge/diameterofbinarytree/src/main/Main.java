package main;

import diameterofbinarytree.DiameterOfBinaryTree;
import diameterofbinarytree.TreeNode;

public class Main {

	public static void main(String[] args) {
		
	TreeNode head = new TreeNode(1);
	head.left = new TreeNode(2);
	head.left.left = new TreeNode(4);
	head.left.right = new TreeNode(5);
	head.right = new TreeNode(3);
	
	DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
	
	System.out.println(diameterOfBinaryTree.diameterOfBinaryTree(head));
	

	}

}
