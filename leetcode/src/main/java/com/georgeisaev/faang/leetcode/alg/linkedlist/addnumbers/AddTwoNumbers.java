package com.georgeisaev.faang.leetcode.alg.linkedlist.addnumbers;

import java.util.StringJoiner;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public interface AddTwoNumbers {

    ListNode addTwoNumbers(ListNode l1, ListNode l2);

}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("->");
        ListNode l = this;
        stringJoiner.add(String.valueOf(l.val));
        while (l.next != null) {
            l = l.next;
            stringJoiner.add(String.valueOf(l.val));
        }
        return stringJoiner.toString();
    }

}