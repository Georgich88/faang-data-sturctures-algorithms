package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArraysIntersectionImpl implements TwoArraysIntersection {

    @Override
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums2.length == 0) {
            return new int[0];
        }
        int[] largest;
        int[] smallest;
        if (nums1.length > nums2.length) {
            largest = nums1;
            smallest = nums2;
        } else {
            smallest = nums1;
            largest = nums2;
        }
        Set<Integer> uniqueNumbers = new HashSet<>(smallest.length);
        for (int number : smallest) {
            uniqueNumbers.add(number);
        }
        List<Integer> intersection = new ArrayList<>(uniqueNumbers.size());
        for (int number : largest) {
            if (uniqueNumbers.contains(number)) {
                intersection.add(number);
                uniqueNumbers.remove(number);
                if (uniqueNumbers.isEmpty()) {
                    break;
                }
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

}
