package com.georgeisaev.faang.leetcode.alg.array.hard.median;

public class TwoSortedArraysMedianImpl implements TwoSortedArraysMedian {

	@Override
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int mergedLength = nums1.length + nums2.length;
		int[] mergedNums = new int[mergedLength];
		int first = 0;
		int second = 0;
		for (int i = 0; i < mergedLength / 2 + 1; i++) {
			if (first < nums1.length
					&& second < nums2.length
					&& nums1[first] < nums2[second]
					|| (first < nums1.length
					&& second >= nums2.length)) {
				mergedNums[i] = nums1[first];
				first++;
			} else {
				mergedNums[i] = nums2[second];
				second++;
			}
		}
		if (mergedLength == 0) {
			return Double.NaN;
		} else if (mergedLength == 1) {
			return mergedNums[0];
		} else if (mergedLength % 2 != 0) {
			return mergedNums[mergedLength / 2];
		} else {
			return (mergedNums[mergedLength / 2 - 1]
					+ mergedNums[mergedLength / 2]) / 2.0;
		}
	}

}
