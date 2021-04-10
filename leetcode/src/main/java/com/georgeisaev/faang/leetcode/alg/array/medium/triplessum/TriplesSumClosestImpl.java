package com.georgeisaev.faang.leetcode.alg.array.medium.triplessum;

import java.util.Arrays;

public class TriplesSumClosestImpl implements TriplesSumClosest {

	@Override
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length == 3) {
			return nums[0] + nums[1] + nums[2];
		}
		Arrays.sort(nums);
		// Auxiliary variables
		int difference = Integer.MAX_VALUE;
		int currentDifference;
		int currentSum;
		// Temp addition terms
		int first;
		int second;
		int third;
		// Indices of second and third terms
		int left;
		int right;
		// Defining closest sum variable
		for (int i = 0; i < nums.length; i++) {
			first = nums[i];
			left = i + 1;
			right = nums.length - 1;
			while (left < right) {
				second = nums[left];
				third = nums[right];
				currentSum = first + second + third;
				currentDifference = currentSum - target;
				if (currentDifference == 0) {
					return currentSum;
				} else if (Math.abs(currentDifference) <= Math.abs(difference)) {
					difference = currentDifference;
				}
				if (second == third) {
					break;
				} else if (currentSum < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		return target + difference;
	}

}
