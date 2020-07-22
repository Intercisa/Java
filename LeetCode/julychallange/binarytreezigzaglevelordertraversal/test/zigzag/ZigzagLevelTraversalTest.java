package zigzag;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class ZigzagLevelTraversalTest {
	
	@Test
	void test_1() {
		
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		
		assertEquals(List.of(List.of(3),List.of(20,9), List.of(15,7)), new ZigzagLevelTraversal().zigzagLevelOrder(root));
	}
}
