package com.georgeisaev.faang.leetcode.alg.array.easy.stack;

/**
 * The next greater element of some element x in an array is the first greater element that is to the right of x in
 * the same array.
 * <p>
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 * <p>
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater
 * element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
 */
public interface NextGreaterElement {

    /**
     * Returns an array ans of length nums1.length such that ans[i] is the next greater element as described above.
     *
     * @param nums1 first array
     * @param nums2 second array
     * @return resulting array
     */
    int[] nextGreaterElement(int[] nums1, int[] nums2);

}
