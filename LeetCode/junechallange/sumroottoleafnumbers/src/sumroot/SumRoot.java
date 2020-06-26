package sumroot;

public class SumRoot {

	
	public int sumNumbers(TreeNode root) {
		return sum(root, 0);
	}

	private int sum(TreeNode node, int res) {
		if(node == null) return 0;
		if(node.right == null && node.left == null) return res*10 + node.val;
		return sum(node.left, res*10+node.val)+sum(node.right, res*10+node.val);
	}
	
	
	public int sumNumbersII(TreeNode root) {
		if (root == null)return 0;

		return dfs(root, 0, 0);
	}

	private int dfs(TreeNode node, int num, int sum) {
		if (node == null) return sum;

		num = num * 10 + node.val;

		// leaf
		if (node.left == null && node.right == null) {
			sum += num;
			return sum;
		}

		// left subtree + right subtree
		sum = dfs(node.left, num, sum) + dfs(node.right, num, sum);
		return sum;
	}
}
