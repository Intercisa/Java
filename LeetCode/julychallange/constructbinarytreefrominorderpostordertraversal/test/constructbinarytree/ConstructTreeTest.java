package constructbinarytree;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ConstructTreeTest {

	private TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
	
	
	@Test
	void test_1() {
		assertEquals(root.val, new ConstructTree().buildTree(new int[] {9,3,15,20,7}, new int[] {9,15,7,20,3}).val);
	}

}
