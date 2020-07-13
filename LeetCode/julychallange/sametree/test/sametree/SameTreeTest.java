package sametree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class SameTreeTest {

	@Test
	void test_1() {
		TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		assertTrue(new SameTree().isSameTree(root1, root2));
	}
	
	
	@Test
	void test_2() {
		TreeNode root1 = new TreeNode(1, new TreeNode(2), null);
		TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
		assertFalse(new SameTree().isSameTree(root1, root2));
	}
	
	@Test
	void test_3() {
		TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
		TreeNode root2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
		assertFalse(new SameTree().isSameTree(root1, root2));
	}
	
}
