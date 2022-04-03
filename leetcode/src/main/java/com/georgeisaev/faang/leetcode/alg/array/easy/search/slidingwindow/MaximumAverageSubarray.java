package com.georgeisaev.faang.leetcode.alg.array.easy.search.slidingwindow;

public interface MaximumAverageSubarray {

    /**
     * Finds a contiguous subarray whose length is equal to k that has the maximum average value and return this
     * value. Any answer with a calculation error less than 10-5 will be accepted.
     *
     * @param nums an integer array nums consisting of n
     * @param k    a subarray length
     * @return maximum average value of a contiguous subarray
     */
    double findMaxAverage(int[] nums, int k);

}
