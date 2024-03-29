package com.georgeisaev.faang.leetcode.alg.array.medium.dynamic;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems
 * connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 */
public interface HouseRobber {

    /**
     * Calculates the maximum amount of money you can rob tonight without alerting the police
     *
     * @param nums an integer array representing the amount of money of each house
     * @return the maximum amount
     */
    int rob(int[] nums);

}
