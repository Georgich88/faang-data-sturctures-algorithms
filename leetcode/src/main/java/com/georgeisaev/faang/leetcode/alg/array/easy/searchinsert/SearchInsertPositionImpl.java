package com.georgeisaev.faang.leetcode.alg.array.easy.searchinsert;

public class SearchInsertPositionImpl implements SearchInsertPosition {

	@Override
	public int searchInsert(int[] nums, int target) {
		// Corner cases
		if (nums.length == 1 && nums[0] >= target) {
			return 0;
		} else if (nums.length == 1) {
			return 1;
		}
		int left = 0;
		int right = nums.length - 1;
		int position = 0;
		while (left <= right) {
			if (nums[left] >= target) {
				position = left;
				break;
			}
			if (nums[right] == target) {
				position = right;
				break;
			} else if (nums[right] < target) {
				position = right + 1;
				break;
			}
			position = target - nums[left] <= target - nums[right] ? left : right;
			left++;
			right--;
		}
		return position;
	}

}
