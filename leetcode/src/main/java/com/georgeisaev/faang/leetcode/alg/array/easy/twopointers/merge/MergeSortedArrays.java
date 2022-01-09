package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.merge;

public interface MergeSortedArrays {

	/**
	 * Merges nums1 and nums2 into a single array sorted in non-decreasing order.
	 * <p>
	 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To
	 * accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be
	 * merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
	 *
	 * @param nums1 integer array sorted in non-decreasing order
	 * @param m     number of elements in nums1
	 * @param nums2 integer array sorted in non-decreasing order
	 * @param n     number of elements in nums2
	 */
	void merge(int[] nums1, int m, int[] nums2, int n);

}
