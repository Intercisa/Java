package levelordertraversal;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class LevelorderTraversalTest {

	@Test
	void test_1() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		
		List<List<Integer>> expected = List.of(List.of(15,7),List.of(9,20),List.of(3));
		
		assertEquals(expected, new LevelorderTraversal().levelOrderBottom(root));
		
	}
}
