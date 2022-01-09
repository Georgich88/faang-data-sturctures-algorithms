package com.georgeisaev.faang.leetcode.alg.array.easy.prefixsum.rangesumquery.immutable;

public class RangeSumQueryImmutableImpl implements RangeSumQueryImmutable {

    private final int[] preSum;

    public RangeSumQueryImmutableImpl(int[] nums) {
        preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = nums[i - 1] + preSum[i - 1];
        }
    }

    @Override
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }

}
