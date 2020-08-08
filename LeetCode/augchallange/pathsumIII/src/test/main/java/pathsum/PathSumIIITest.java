package main.java.pathsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PathSumIIITest {

    private TreeNode root;

    @BeforeEach
    public void initTree(){
        root = new TreeNode(10);
        root.right = new TreeNode(-3);
        root.right.right = new TreeNode(11);

        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(1);
    }

    @Test
    void pathSum() {
        assertEquals(3, new PathSumIII().pathSum(root, 8));

    }
}