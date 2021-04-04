package com.georgeisaev.faang.leetcode.alg.array.easy.removeduplicatesfromsorted;

public class RemoveDuplicatesFromSortedArrayImpl implements RemoveDuplicatesFromSortedArray {

	@Override
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int length = nums.length; // length of unique sorted array
		int position = 0; // position of unique sorted array
		int value = nums[position]; // current value

		while (position < length - 1) {
			if (nums[position + 1] != value) {
				value = nums[position + 1];
				position = position + 1;
			} else {
				length--;
				for (int j = position + 1; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
			}
		}

		return length;
	}

}
