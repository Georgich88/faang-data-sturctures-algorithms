package com.georgeisaev.faang.leetcode.alg.array.medium.permutations;

import java.util.Arrays;

public class NextPermutationImpl implements NextPermutation {

	@Override
	public void nextPermutation(int[] nums) {

		int position;
		for (position = nums.length - 1; position > 0; position--) {
			if (nums[position] > nums[position - 1]) {
				break;
			}
		}

		if (position == 0) {
			Arrays.sort(nums);
		} else {
			for (int i = position + 1; i < nums.length; i++) {
				if (nums[i] < nums[position] && nums[i] > nums[position - 1]) {
					swap(nums, position, i);
				}
			}
			swap(nums, position - 1, position);
			Arrays.sort(nums, position, nums.length);
		}
	}

	void swap(int[] nums, int i, int j) {
		nums[i] = nums[j] ^ nums[i];
		nums[j] = nums[j] ^ nums[i];
		nums[i] = nums[j] ^ nums[i];
	}

}
