package com.georgeisaev.faang.leetcode.alg.array.easy.search.slidingwindow;

public class MaximumAverageSubarrayImpl implements MaximumAverageSubarray {

    public static void main(String[] args) {
        new MaximumAverageSubarrayImpl().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
    }

    /**
     * {@inheritDoc}
     *
     * @param nums an integer array nums consisting of n
     * @param k    a subarray length
     * @return maximum average value of a contiguous subarray
     */
    @Override
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

        }
        return ((double) maxSum) / k;
    }

}
