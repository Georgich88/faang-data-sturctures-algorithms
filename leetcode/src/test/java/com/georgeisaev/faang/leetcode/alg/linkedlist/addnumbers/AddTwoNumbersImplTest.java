package com.georgeisaev.faang.leetcode.alg.linkedlist.addnumbers;

import com.georgeisaev.faang.leetcode.alg.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class AddTwoNumbersImplTest {

    AddTwoNumbers algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new AddTwoNumbersImpl();
    }

    @Test
    void shouldAddTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        Assertions.assertArrayEquals(new int[]{7, 0, 8}, listNodeToArray(algorithm.addTwoNumbers(l1, l2)));
    }

    @Test
    void shouldAddTwoNumbersArraysDifferentLength() {
        ListNode l1 = arrayToListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = arrayToListNode(new int[]{9, 9, 9, 9});
        Assertions.assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1},
                listNodeToArray(algorithm.addTwoNumbers(l1, l2)));
    }

    @Test
    void shouldAddTwoNumbersArraysDifferentLength2() {
        ListNode l1 = arrayToListNode(new int[]{5, 6, 4});
        ListNode l2 = arrayToListNode(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 1});
        Assertions.assertArrayEquals(new int[]{6, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
                        , 0, 0, 0, 0, 0, 0, 1},
                listNodeToArray(algorithm.addTwoNumbers(l1, l2)));
    }

    private static ListNode arrayToListNode(int[] numbers) {
        ListNode root = new ListNode(-1);
        ListNode node = root;
        for (int number : numbers) {
            if (node.val == -1) {
                node.val = number;
            } else {
                node.next = new ListNode(number);
                node = node.next;
            }
        }
        return root;
    }

    private static int[] listNodeToArray(ListNode node) {
        IntStream.Builder builder = IntStream.builder();
        while (node != null) {
            builder.add(node.val);
            node = node.next;
        }
        return builder.build().toArray();
    }

    @Test
    void shouldAddTwoNumbersZeroInput() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        Assertions.assertArrayEquals(new int[]{0}, listNodeToArray(algorithm.addTwoNumbers(l1, l2)));
    }

}