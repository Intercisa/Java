package count;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CountNodesTest {

	@Test
	void test_1() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		
		assertEquals(6, new CountNodes().countNodes(root));
		
		
		
	}
}
