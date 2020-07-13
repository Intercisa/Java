package sametree;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {

		if(p == null || q == null) return (p == q);
		
		return isSameTree(p.left, q.left)
				&& isSameTree(p.right, q.right)
				&& (p.val == q.val);
	}
	
	public boolean isSameTreeII(TreeNode p, TreeNode q) {

		if(p == null && q ==null) return true;
        if(p == null || q ==null ) return false;
        if(p.val != q.val) return false;
        
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
	}
	
}
