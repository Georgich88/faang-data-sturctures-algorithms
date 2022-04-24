package com.georgeisaev.faang.leetcode.alg.array.medium.dynamic;

import java.util.Arrays;

public class HouseRobberImpl implements HouseRobber {

    @Override
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return robFrom(nums, 0, memo);
    }


    private int robFrom(int[] nums, int houseNumber, int[] memo) {

        if (houseNumber >= nums.length) {
            return 0; // no more houses to examine
        }

        if (memo[houseNumber] > -1) {
            return memo[houseNumber]; // return cached result
        }

        // Examine current amount added up next possible house and adjacent house
        int amountToRob = Math.max(
                nums[houseNumber] + robFrom(nums, houseNumber + 2, memo),
                robFrom(nums, houseNumber + 1, memo));

        // Cache the result for the further calculations
        memo[houseNumber] = amountToRob;

        return amountToRob;

    }

}
