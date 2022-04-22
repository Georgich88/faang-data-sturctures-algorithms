package com.georgeisaev.faang.leetcode.alg.array.easy.memoization;

public class ClimbingStairsMemoizationImpl implements ClimbingStairs {

    @Override
    public int climbStairs(int n) {
        int[] memo = new int[n];
        return climbStairStep(0, n, memo);
    }

    private static int climbStairStep(int position, int size, int[] memo) {
        if (position > size) {
            return 0;
        }
        if (position == size) {
            return 1;
        }
        if (memo[position] > 0) {
            return memo[position];
        }
        memo[position] = climbStairStep(position + 1, size, memo)
                + climbStairStep(position + 2, size, memo);
        return memo[position];
    }

}
