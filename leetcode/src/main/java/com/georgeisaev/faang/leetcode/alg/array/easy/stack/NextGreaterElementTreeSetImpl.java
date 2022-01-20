package com.georgeisaev.faang.leetcode.alg.array.easy.stack;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class NextGreaterElementTreeSetImpl implements NextGreaterElement {

    @Override
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        TreeSet<Integer> previous = new TreeSet<>();
        HashMap<Integer, Integer> numberByGreater = new HashMap<>();
        for (int num : nums2) {
            SortedSet<Integer> before = previous.headSet(num);
            while (!before.isEmpty()) {
                numberByGreater.put(previous.pollFirst(), num);
                before = previous.headSet(num);
            }
            previous.add(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = numberByGreater.getOrDefault(nums1[i], -1);
        }
        return result;
    }

}
