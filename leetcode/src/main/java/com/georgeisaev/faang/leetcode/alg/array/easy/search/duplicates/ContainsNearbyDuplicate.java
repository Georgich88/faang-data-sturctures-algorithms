package com.georgeisaev.faang.leetcode.alg.array.easy.search.duplicates;

/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such
 * that nums[i] == nums[j] and abs(i - j) <= k.
 */
public interface ContainsNearbyDuplicate {

    boolean containsNearbyDuplicate(int[] nums, int k);

}
