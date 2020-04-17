package diameterofbinarytree;

public class DiameterOfBinaryTree {
	private int maxDiam;
		
	  public int diameterOfBinaryTree(TreeNode root) {
		  maxDiam = 0;
		  depth(root);
		  return maxDiam;
		
	}
	private int depth(TreeNode root) {
		if(root == null) return 0;
		
		int left = depth(root.left);
		int rigth = depth(root.right);
		
		maxDiam = Math.max(maxDiam, left+rigth);
		
		return Math.max(left, rigth) +1;	
	}
}
/*
At each node, get the depth of it's left and right paths, 
update the result if the sum is greater than current maximum. 
Return the depth, which is maximum of left and right paths' depth + 1, to the parent.
*/