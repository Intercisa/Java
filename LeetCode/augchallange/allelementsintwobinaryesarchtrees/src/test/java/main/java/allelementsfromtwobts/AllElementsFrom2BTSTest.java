package main.java.allelementsfromtwobts;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllElementsFrom2BTSTest {

    @Test
    void getAllElements_1() {
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(4));
        TreeNode root2 = new TreeNode(1, new TreeNode(0), new TreeNode(3));

        assertEquals(List.of(0,1,1,2,3,4), new AllElementsFrom2BTS().getAllElements(root1,root2));
    }

    @Test
    void getAllElements_2() {
        TreeNode root1 = null;
        TreeNode root2 = new TreeNode(5, new TreeNode(1, new TreeNode(0), null), new TreeNode(7, new TreeNode(2), null));

        assertEquals(List.of(0,1,2,5,7), new AllElementsFrom2BTS().getAllElements(root1,root2));
    }
}