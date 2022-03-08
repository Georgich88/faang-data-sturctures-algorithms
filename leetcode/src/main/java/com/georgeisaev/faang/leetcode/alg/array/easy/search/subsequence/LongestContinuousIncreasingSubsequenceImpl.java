package com.georgeisaev.faang.leetcode.alg.array.easy.search.subsequence;

import java.util.HashMap;
import java.util.Map;

public class LongestContinuousIncreasingSubsequenceImpl implements LongestContinuousIncreasingSubsequence {

    @Override
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

}

class Solution {

    private static final int LEFT = 0;
    private static final int RIGHT = 1;

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }


    public static int findShortestSubArray(int[] nums) {

        Map<Integer, int[]> boundaryByNumber = new HashMap<>();
        Map<Integer, Integer> frequencyByNumber = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int[] boundary = boundaryByNumber.computeIfAbsent(nums[i], k -> new int[]{-1, -1});
            if (boundary[LEFT] < 0) {
                boundary[LEFT] = i;
            }
            boundary[RIGHT] = i;
            frequencyByNumber.merge(nums[i], 1, Integer::sum);
        }

        int maxFrequency = Integer.MIN_VALUE;
        int subArrayLength = Integer.MAX_VALUE;
        for (var entry : frequencyByNumber.entrySet()) {
            if (entry.getValue() >= maxFrequency) {
                int[] boundary = boundaryByNumber.get(entry.getKey());
                int currentLength = boundary[RIGHT] - boundary[LEFT] + 1;
                subArrayLength = entry.getValue() == maxFrequency
                        ? Math.min(subArrayLength, currentLength)
                        : currentLength;
                maxFrequency = entry.getValue();
            }
        }

        return subArrayLength;

    }

}