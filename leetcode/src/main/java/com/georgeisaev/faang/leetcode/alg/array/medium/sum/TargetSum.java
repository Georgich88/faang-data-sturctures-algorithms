package com.georgeisaev.faang.leetcode.alg.array.medium.sum;

/**
 * You are given an integer array nums and an integer target.
 * <p>
 * You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums
 * and then concatenate all the integers.
 * <p>
 * For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the
 * expression "+2-1".
 */
public interface TargetSum {

    /**
     * Returns the number of different expressions that can be built, which evaluates to target.
     *
     * @param nums   numbers
     * @param target target to find a sum
     * @return the number of different expressions that can be built, which evaluates to target
     */
    int findTargetSumWays(int[] nums, int target);

}
