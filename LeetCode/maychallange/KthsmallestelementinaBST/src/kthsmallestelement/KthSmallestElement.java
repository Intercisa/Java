package kthsmallestelement;

import java.util.ArrayList;

public class KthSmallestElement {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	 public int kthSmallest(TreeNode root, int k) {
	        
		 inOrderBTS(root);
		 
		 return list.get(k-1); //because it is already in ascending order >> return k-1th element from the list
	    }

	private void inOrderBTS(TreeNode root) { //in order traversal gives us the values in ascending order
		if(root == null) return;
		
		inOrderBTS(root.left);
		list.add(root.val); //put the current value in the list 
		inOrderBTS(root.right);
		
	}
}