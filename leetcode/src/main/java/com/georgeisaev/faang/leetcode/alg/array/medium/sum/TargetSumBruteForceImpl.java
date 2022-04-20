package com.georgeisaev.faang.leetcode.alg.array.medium.sum;

public class TargetSumBruteForceImpl implements TargetSum {

    @Override
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWaysRecursively(nums, 0, 0, target);
    }

    private static int findTargetSumWaysRecursively(int[] nums, int position, int totalSum, final int target) {
        if (position == nums.length) {
            return (totalSum == target) ? 1 : 0;
        }
        return findTargetSumWaysRecursively(nums, position + 1, totalSum + nums[position], target)
                + findTargetSumWaysRecursively(nums, position + 1, totalSum - nums[position], target);
    }

}
