package com.georgeisaev.faang.leetcode.alg.array.easy.search.thridmaxnumber;

import java.util.Arrays;

public class ThirdMaximumNumberSortImpl implements ThirdMaximumNumber {

    @Override
    public int thirdMax(int[] nums) {
        // Input data validation
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int maxNumber = Integer.MIN_VALUE;
        int attempt = 3;
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] != maxNumber) {
                maxNumber = nums[i];
                attempt--;
            }
            if (attempt == 0) {
                return maxNumber;
            }
        }
        return nums[nums.length-1];
    }

}
