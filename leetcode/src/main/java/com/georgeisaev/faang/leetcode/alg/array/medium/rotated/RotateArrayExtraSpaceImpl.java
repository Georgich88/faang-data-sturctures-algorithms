package com.georgeisaev.faang.leetcode.alg.array.medium.rotated;

public class RotateArrayExtraSpaceImpl implements RotateArray {

    @Override
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        int[] result = new int[nums.length];
        if (k >= nums.length) {
            k = k % nums.length;
        }
        System.arraycopy(nums, 0, result, k, nums.length - k);
        System.arraycopy(nums, nums.length - k, result, 0, k);
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

}
