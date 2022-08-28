package com.georgeisaev.faang.leetcode.alg.string;

public class LongestStringChainImpl {

    public static void main(String[] args) {
        new LongestStringChainImpl().longestStrChain(new String[]{"a", "b", "ba", "bca", "bda", "bdca"});
    }

    public int longestStrChain(String[] words) {
        int curLength = 1;
        int maxLength = 1;
        for (int i = 1; i < words.length; i++) {
            if (isPredecessor(words[i - 1], words[i])) {
                curLength++;
                maxLength = Math.max(curLength, maxLength);
            } else {
                curLength = 1;
            }
        }
        return maxLength;
    }

    private boolean isPredecessor(String firstWord, String secondWord) {
        if (firstWord.length() == secondWord.length()) {
            return firstWord.equals(secondWord);
        }
        int difference = 0;
        int first = 0;
        int second = 0;
        while (second < secondWord.length() && difference < 2) {
            if (firstWord.charAt(first) != secondWord.charAt(second)) {
                difference++;
                second++;
            }
            first++;
            second++;
        }
        return difference < 2;
    }

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

}

class Solution {

    public static void main(String[] args) {
        new Solution().mergeTwoLists(new ListNode(1), new ListNode(2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode first = list1;
        ListNode second = list2;
        final ListNode head;
        if (first.val < second.val) {
            head = new ListNode(first.val);
            first = first.next;
        } else {
            head = new ListNode(second.val);
            second = second.next;
        }
        ListNode current = head;

        while (first != null && second != null) {
            if (first.val < second.val) {
                current.next = new ListNode(first.val);
                first = first.next;
            } else {
                current.next = new ListNode(second.val);
                second = second.next;
            }
            current = current.next;
        }

        ListNode leftOver = first == null ? second : first;
        while (leftOver != null) {
            current.next = new ListNode(leftOver.val);
            leftOver = leftOver.next;
            current = current.next;
        }

        return head;
    }

}