package com.georgeisaev.faang.leetcode.alg.array.easy.search.missingnumber;

public class MissingNumberImpl implements MissingNumber {

    @Override
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int number : nums) {
            sum += number;
        }
        return (nums.length) * (nums.length + 1) / 2 - sum;
    }

}
