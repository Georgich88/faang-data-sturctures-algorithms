package com.georgeisaev.faang.leetcode.alg.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.StringJoiner;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("java:S1104")
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
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

    public static ListNode fromArray(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode();
        ListNode current = head;
        for (int i = 0; i < values.length; i++) {
            current.val = values[i];
            current.next = new ListNode();
            if (i != values.length - 1) {
                current = current.next;
            }
        }
        current.next = null;
        return head;
    }

}
