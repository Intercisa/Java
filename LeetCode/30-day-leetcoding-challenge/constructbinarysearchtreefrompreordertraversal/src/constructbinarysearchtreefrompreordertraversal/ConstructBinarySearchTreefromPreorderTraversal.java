package constructbinarysearchtreefrompreordertraversal;

public class ConstructBinarySearchTreefromPreorderTraversal {
	
	 public TreeNode bstFromPreorder(int[] preorder) {
		if(preorder == null || preorder.length == 0) return null;
		int n = preorder.length;
		
		TreeNode head = new TreeNode(preorder[0]); //the first element of the array is always the first value of the tree 
		if(n == 1) return head;
		
		head = constructTree(head ,preorder[0]);
        
		for(int i = 1; i < n ; i++) //you start from 1 because you want to compare the values, and zero element is already in head 
        	constructTree(head,preorder[i]);
        
		return head;
    }
	
	
	   private TreeNode constructTree(TreeNode node, int val) {
	        if(node==null) { //we check if the value is already set or not 
	            node=new TreeNode(val); //if not we initialize with val 
	            
	        } else if(val < node.val) {//in a binary tree for every node, any descendant of node.left has a value < node.val
	            node.left = constructTree(node.left, val);//we go a level deeper 
	        } else if( val > node.val) {//in a binary tree for every node, any descendant of node.right has a value > node.val
	            node.right = constructTree(node.right, val);//we go a level deeper 
	        }
	        return node;
	        
	    }
}

