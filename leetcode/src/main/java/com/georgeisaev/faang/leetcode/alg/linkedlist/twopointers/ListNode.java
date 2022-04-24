package com.georgeisaev.faang.leetcode.alg.linkedlist.twopointers;

import java.util.StringJoiner;

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
