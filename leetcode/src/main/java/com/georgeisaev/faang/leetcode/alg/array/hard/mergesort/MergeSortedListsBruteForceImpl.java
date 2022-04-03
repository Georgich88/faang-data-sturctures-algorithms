package com.georgeisaev.faang.leetcode.alg.array.hard.mergesort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedListsBruteForceImpl implements MergeSortedLists {

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        // Traverse all the linked lists and collect the values of the nodes into an array.
        List<Integer> numbers = new ArrayList<>();
        for (var list : lists) {
            if (list == null) continue;
            numbers.add(list.val);
            var next = list.next;
            while (next != null) {
                numbers.add(next.val);
                next = next.next;
            }
        }
        // Sort and iterate over this array to get the proper value of nodes.
        numbers.sort(Integer::compareTo);
        if (numbers.isEmpty()) {
            return null;
        }
        // Create a new sorted linked list and extend it with the new nodes.
        ListNode result = new ListNode(numbers.get(0));
        ListNode current = result;
        for (int i = 1; i < numbers.size(); i++) {
            current.next = new ListNode(numbers.get(i));
            current = current.next;
        }
        return result;
    }

}
