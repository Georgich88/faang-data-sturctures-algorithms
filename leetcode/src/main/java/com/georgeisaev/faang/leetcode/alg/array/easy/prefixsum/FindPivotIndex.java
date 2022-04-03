package com.georgeisaev.faang.leetcode.alg.array.easy.prefixsum;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the
 * sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public interface FindPivotIndex {

    int pivotIndex(int[] nums);

}
