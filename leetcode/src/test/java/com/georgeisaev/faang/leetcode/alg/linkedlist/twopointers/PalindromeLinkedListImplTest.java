package com.georgeisaev.faang.leetcode.alg.linkedlist.twopointers;

import com.georgeisaev.faang.leetcode.alg.linkedlist.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeLinkedListImplTest {

    PalindromeLinkedList algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new PalindromeLinkedListImpl();
    }

    @Test
    void shouldIdentifyPalindrome() {
        assertTrue(algorithm.isPalindrome(ListNode.fromArray(1, 2, 2, 1)));
    }

    @Test
    void shouldIdentifyNonPalindrome() {
        assertFalse(algorithm.isPalindrome(ListNode.fromArray(1, 2)));
    }


}