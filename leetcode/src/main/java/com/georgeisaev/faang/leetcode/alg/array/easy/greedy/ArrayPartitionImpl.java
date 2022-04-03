package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

import java.util.Arrays;

public class ArrayPartitionImpl implements ArrayPartition {

    @Override
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

}
