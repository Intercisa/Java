package main.java.reorderlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {

    @Test
    void reorderList_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        new ReorderList().reorderList(head);
    }

    @Test
    void reorderList_2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        new ReorderList().reorderList(head);
    }
}