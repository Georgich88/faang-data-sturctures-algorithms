package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.square;

public class SortedArraySquaresImpl implements SortedArraySquares {

    @Override
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pointer = right;
        int[] result = new int[nums.length];
        while(left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[pointer] = nums[right] * nums[right];
                right--;
            } else {
                result[pointer] = nums[left] * nums[left];
                left++;
            }
            pointer--;
        }
        return result;
    }

}
