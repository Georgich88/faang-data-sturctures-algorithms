package com.georgeisaev.faang.leetcode.alg.array.hard.missingnumber;

public class FirstMissingPositiveImpl implements FirstMissingPositive {

	@Override
	public int firstMissingPositive(int[] nums) {

		// Corner cases
		if (nums.length == 1) {
			return nums[0] == 1 ? 2 : 1;
		}

		int target;
		int temp;

		// Put elements in order where value equals their order
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0) {
				continue;
			}
			target = nums[i];
			while (target <= nums.length && target != nums[target - 1]) {
				temp = nums[target - 1];
				nums[target - 1] = target;
				target = temp;
				if (target <= 0) {
					break;
				}
			}
		}

		// Find first order that does not match its value
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}
		return nums.length + 1;

	}

}
