package com.georgeisaev.faang.leetcode.alg.linkedlist.twopointers;

import com.georgeisaev.faang.leetcode.alg.linkedlist.ListNode;

public class LinkedListMiddleImpl implements LinkedListMiddle {

    @Override
    public ListNode middleNode(ListNode head) {
        int size = 0;
        int middleIdx = 0;
        ListNode middle = head;
        ListNode node = head;
        while (node != null) {
            size++;
            if (middleIdx != size / 2) {
                middleIdx = size / 2;
                middle = middle.next;
            }
            node = node.next;
        }
        return middle;
    }

}
