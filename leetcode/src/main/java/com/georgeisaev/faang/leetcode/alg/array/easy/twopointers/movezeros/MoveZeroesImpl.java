package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.movezeros;

public class MoveZeroesImpl implements MoveZeroes {

    @Override
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i=nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
