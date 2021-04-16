package com.georgeisaev.faang.leetcode.alg.array.medium.sorted;

public class FirstLastPositionInSortedArrayImpl implements FirstLastPositionInSortedArray {

	@Override
	public int[] searchRange(int[] nums, int target) {

		int[] positions = {-1, -1};

		// Corner cases:
		if (nums.length == 0) {
			return positions;
		} else if (nums.length == 1 && nums[0] == target) {
			positions[0] = 0;
			positions[1] = 0;
			return positions;
		}

		int first = 0;
		int last = nums.length - 1;
		while (first <= last) {

			if (positions[0] == -1
					&& nums[first] == target) {
				positions[0] = first;
			}
			if (positions[1] == -1
					&& nums[last] == target) {
				positions[1] = last;
			}
			if (positions[0] != -1 && positions[1] != -1) {
				break;
			}

			int middle = first + (last - first) / 2;
			if (nums[middle] > target) {
				last = middle - 1;
				continue;
			} else if (nums[middle] < target) {
				first = middle + 1;
				continue;
			}

			// [0, ... , nums[middle] = target]
			if (nums[first] != target) {
				first++;
				int tempMiddle = middle;
				while (first < tempMiddle) {
					tempMiddle = first + (tempMiddle - first) / 2;
					if (nums[tempMiddle] < target) {
						first = tempMiddle;
					} else {
						break;
					}
				}
			}

			// [nums[middle] = target, ... nums.length]
			if (nums[last] != target) {
				last--;
				int tempMiddle = middle;
				while (tempMiddle < last) {
					tempMiddle = tempMiddle + (last - tempMiddle) / 2;
					if (nums[tempMiddle] > target) {
						last = tempMiddle;
					} else {
						break;
					}
				}
			}
		}

		return positions;
	}

}
