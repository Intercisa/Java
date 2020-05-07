package cousins;



public class CousinsInBinaryTree {
	
	
	private int xParent, xDepth, yParent, yDepth, x, y; //we need to keep tracking this values 
	
	  public boolean isCousins(TreeNode root, int x, int y) {
	   this.x = x; 
	   this.y = y;
	   
	   preOrderCheck(root, 0, 1); //index of the parent and the depth 
	   
	   return xParent != yParent && xDepth == yDepth;
		  
	  }

	private void preOrderCheck(TreeNode root, int parent, int depth) {
		if(root == null) return;
		
		if(root.val == x) {
			xParent = parent;
			xDepth = depth;
		}
		
		if(root.val == y) {
			yParent = parent;
			yDepth = depth;
		}
		
		preOrderCheck(root.left, root.val, depth+1); //current nodes value becomes the next nodes parents value and increase the depth 
		preOrderCheck(root.right, root.val, depth+1);
	}
}




