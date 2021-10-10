package com.georgeisaev.faang.leetcode.alg.array.easy.sort.merge;

public class MergeSortedArraysImpl implements MergeSortedArrays {

	@Override
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int firstPivot = 0;
		int secondPivot = 0;
		int resultPivot = 0;

		int[] auxiliary = new int[m + n];

		while (firstPivot < m && secondPivot < n) {
			if (nums1[firstPivot] <= nums2[secondPivot]) {
				auxiliary[resultPivot] = nums1[firstPivot];
				resultPivot++;
				firstPivot++;
			} else {
				auxiliary[resultPivot] = nums2[secondPivot];
				resultPivot++;
				secondPivot++;
			}
		}
		while (firstPivot < m) {
			auxiliary[resultPivot] = nums1[firstPivot];
			resultPivot++;
			firstPivot++;
		}

		while (secondPivot < n) {
			auxiliary[resultPivot] = nums2[secondPivot];
			resultPivot++;
			secondPivot++;
		}

		System.arraycopy(auxiliary, 0, nums1, 0, auxiliary.length);

	}

}
