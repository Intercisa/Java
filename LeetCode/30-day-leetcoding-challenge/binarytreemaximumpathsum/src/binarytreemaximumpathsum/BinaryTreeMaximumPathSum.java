package binarytreemaximumpathsum;

public class BinaryTreeMaximumPathSum {

	/*
	 * There can only be four different cases when a particular node is involved in the max path.
    	Its the only Node
    	Max path through Left Child + Node
    	Max path through Right Child + Node
    	Max path through Left Child + Node + Right Child
    	
    	Each node can be the root of the final maximum path sum >> means the topmost node in a path.
		The best at current node is equal to value at current node + max(left child, right child)	
	 */

		private int max =Integer.MIN_VALUE;
		
	    public int maxPathSum(TreeNode root) {
	        return Math.max(calculateMax(root), max);
	    }

		private int calculateMax(TreeNode node) {
			if (node == null) return 0;
			
			int left = Math.max(calculateMax(node.left), 0);
			int right = Math.max(calculateMax(node.right), 0);
			max = Math.max(node.val+left+right, max);
			return node.val + Math.max(left, right); //we have to consider if it's a single node tree 
		} 
}