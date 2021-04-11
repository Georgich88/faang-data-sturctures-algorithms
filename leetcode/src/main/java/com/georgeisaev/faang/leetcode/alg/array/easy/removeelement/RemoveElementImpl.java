package com.georgeisaev.faang.leetcode.alg.array.easy.removeelement;

public class RemoveElementImpl implements RemoveElement {

	@Override
	public int removeElement(int[] nums, int val) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (nums[i] == val) {
				length--;
				for (int j = i + 1; i < nums.length && j < nums.length; j++) {
					if (nums[j] != val) {
						nums[i] = nums[j];
						i++;
					} else {
						length--;
					}
				}
			}
		}
		return length;
	}

}
