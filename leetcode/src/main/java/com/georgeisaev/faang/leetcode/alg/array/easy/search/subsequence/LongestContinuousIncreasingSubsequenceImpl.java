package com.georgeisaev.faang.leetcode.alg.array.easy.search.subsequence;

public class LongestContinuousIncreasingSubsequenceImpl implements LongestContinuousIncreasingSubsequence {

    @Override
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] > nums[i]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

}
