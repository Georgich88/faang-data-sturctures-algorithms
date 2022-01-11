package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.intersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoArraysIntersectionManyTimesImpl implements TwoArraysIntersectionManyTimes {

    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] largest;
        int[] smallest;
        if (nums1.length > nums2.length) {
            largest = nums1;
            smallest = nums2;
        } else {
            smallest = nums1;
            largest = nums2;
        }
        Map<Integer, Integer> countByUniqueNumber = new HashMap<>(smallest.length);
        for (int k : smallest) {
            countByUniqueNumber.merge(k, 1, Integer::sum);
        }
        List<Integer> intersection = new ArrayList<>(countByUniqueNumber.size());
        for (int k : largest) {
            if (countByUniqueNumber.containsKey(k)) {
                intersection.add(k);
                countByUniqueNumber.merge(k, 1, (v1, v2) -> v1 - v2);
                if (countByUniqueNumber.get(k).equals(0)) {
                    countByUniqueNumber.remove(k);
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
