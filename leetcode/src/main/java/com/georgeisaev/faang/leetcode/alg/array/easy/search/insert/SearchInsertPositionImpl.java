package com.georgeisaev.faang.leetcode.alg.array.easy.search.insert;

public class SearchInsertPositionImpl implements SearchInsertPosition {

	@Override
	public int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int pivot;
		while(left <= right) {
			pivot = (right + left) >>> 1;
			if (nums[pivot] < target) {
				left = pivot + 1;
			} else if (nums[pivot] > target) {
				right = pivot - 1;
			} else {
				return pivot;
			}
		}
		return left;
	}

}
