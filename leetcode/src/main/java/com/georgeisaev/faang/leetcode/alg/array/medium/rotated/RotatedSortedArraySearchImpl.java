package com.georgeisaev.faang.leetcode.alg.array.medium.rotated;

public class RotatedSortedArraySearchImpl implements RotatedSortedArraySearch {

	@Override
	public int search(int[] nums, int target) {
		int targetPosition = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				targetPosition = i;
				break;
			}
			if (i < nums.length - 1 && nums[i] > nums[i + 1]
					&& nums[i] < target && nums[i + 1] > target) {
				break;
			}
		}
		return targetPosition;
	}

}
