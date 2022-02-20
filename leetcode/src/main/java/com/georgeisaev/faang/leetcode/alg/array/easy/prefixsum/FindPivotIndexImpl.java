package com.georgeisaev.faang.leetcode.alg.array.easy.prefixsum;

public class FindPivotIndexImpl implements FindPivotIndex {

    @Override
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum == totalSum - currentSum - nums[i]) {
                return i;
            }
            currentSum += nums[i];
        }
        return -1;
    }

}
