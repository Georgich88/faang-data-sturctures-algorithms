package com.georgeisaev.faang.leetcode.alg.linkedlist.addnumbers;

public class AddTwoNumbersImpl implements AddTwoNumbers {

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        // First number
        final ListNode root = new ListNode(sum % 10);
        ListNode node = root;
        ListNode n1 = l1.next;
        ListNode n2 = l2.next;
        sum /= 10;
        // Fill other numbers
        while (n1 != null || n2 != null) {
            sum += ((n1 != null) ? n1.val : 0) + ((n2 != null) ? n2.val : 0);
            if (n1 != null) {
                n1 = n1.next;
            }
            if (n2 != null) {
                n2 = n2.next;
            }
            node.next = new ListNode(sum % 10);
            node = node.next;
            sum /= 10;
        }
        // Last number
        if (sum > 0) {
            node.next = new ListNode(sum);
        }
        return root;
    }

}
