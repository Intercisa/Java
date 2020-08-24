package main.java.sumofleftleaves;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfLeftLeavesTest {
    private TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    @Test
    void sumOfLeftLeaves() {
        assertEquals(24, new SumOfLeftLeaves().sumOfLeftLeaves(root));
    }
}