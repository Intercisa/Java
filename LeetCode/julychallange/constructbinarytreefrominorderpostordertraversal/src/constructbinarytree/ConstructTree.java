package constructbinarytree;

public class ConstructTree {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int len = inorder.length;
		if(len == 0) return null;
		return constructTree(inorder, postorder, 0, len - 1, 0, len - 1);
		
	}

	private TreeNode constructTree(int[] ino, int[] posto, int iStart, int iEnd, int pStart, int pEnd) {
		TreeNode root = new TreeNode(posto[pEnd]);
		int rootIndex = getRootIndex(ino, root.val, iStart, iEnd);
		int LSS = rootIndex - iStart;
		int RSS = iEnd - rootIndex;
		
		if(LSS == 0) root.left = null;
		else if (LSS == 1) root.left = new TreeNode(ino[iStart]);
		else root.left = constructTree(ino, posto, iStart, rootIndex - 1, pStart, pStart + LSS -1);
		
		if (RSS == 0) root.right = null;
		else if(RSS == 1) root.right = new TreeNode(ino[iEnd]);
		else root.right = constructTree(ino, posto, rootIndex + 1, iEnd, pStart + LSS, pEnd - 1);
		
		return root;
		
	}

	private int getRootIndex(int[] ino, int val, int iStart, int iEnd) {
			for (int i = iStart; i <= iEnd; i++) 
				if(ino[i] == val) return i;
			return -1;
	}
}
