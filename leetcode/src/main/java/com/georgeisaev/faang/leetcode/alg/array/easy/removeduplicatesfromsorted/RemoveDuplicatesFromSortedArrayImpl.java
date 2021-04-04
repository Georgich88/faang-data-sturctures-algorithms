package com.georgeisaev.faang.leetcode.alg.array.easy.removeduplicatesfromsorted;

public class RemoveDuplicatesFromSortedArrayImpl implements RemoveDuplicatesFromSortedArray {

	@Override
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		// Auxiliary variable
		int position; // position of unique sorted array
		int length = 1; // length of unique sorted array
		int value = nums[0]; // current value
		// Array offset
		for (position = 1; position < nums.length; position++) {
			if (nums[position] != value) {
				value = nums[position];
				nums[length] = nums[position];
				length++;
			}
		}
		return length;
	}

}
