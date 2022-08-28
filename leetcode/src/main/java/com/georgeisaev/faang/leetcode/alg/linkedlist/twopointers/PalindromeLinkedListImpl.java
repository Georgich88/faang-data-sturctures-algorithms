package com.georgeisaev.faang.leetcode.alg.linkedlist.twopointers;


import com.georgeisaev.faang.leetcode.alg.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeLinkedListImpl implements PalindromeLinkedList {

    /**
     * Given the head of a singly linked list, return true if it is a palindrome.
     *
     * @param head the head of a singly linked list
     * @return {@code true} if it is a palindrome
     */
    @Override
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int left = 0;
        int right = values.size() - 1;
        while (left < right) {
            if (!Objects.equals(values.get(left), values.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
