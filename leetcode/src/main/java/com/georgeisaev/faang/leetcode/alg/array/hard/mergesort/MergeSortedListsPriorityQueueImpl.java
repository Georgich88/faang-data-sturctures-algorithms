package com.georgeisaev.faang.leetcode.alg.array.hard.mergesort;

import java.util.PriorityQueue;

public class MergeSortedListsPriorityQueueImpl implements MergeSortedLists {

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        // Traverse all the linked lists and collect the values of the nodes into an array.
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        for (var list : lists) {
            if (list == null) {
                continue;
            }
            numbers.offer(list.val);
            var next = list.next;
            while (next != null) {
                numbers.offer(next.val);
                next = next.next;
            }
        }
        // Sort and iterate over this array to get the proper value of nodes.
        if (numbers.isEmpty()) {
            return null;
        }
        // Create a new sorted linked list and extend it with the new nodes.
        ListNode result = new ListNode(numbers.poll());
        ListNode current = result;
        while (!numbers.isEmpty()) {
            current.next = new ListNode(numbers.poll());
            current = current.next;
        }
        return result;
    }

}
