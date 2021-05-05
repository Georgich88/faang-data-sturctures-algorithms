package com.georgeisaev.faang.leetcode.alg.array.easy.maxSum;

public class MaximumSubarrayImpl implements MaximumSubarray {

	@Override
	public int maxSubArray(int[] nums) {

		int sum = nums[0];
		int currentSum = 0;

		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if (currentSum > sum) {
				sum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return sum;
	}

}
