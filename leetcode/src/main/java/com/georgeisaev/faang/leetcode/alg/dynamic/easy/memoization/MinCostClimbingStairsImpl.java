package com.georgeisaev.faang.leetcode.alg.dynamic.easy.memoization;

public class MinCostClimbingStairsImpl implements MinCostClimbingStairs {

    @Override
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        for (int i = 2; i < minCost.length; i++) {
            minCost[i] = Math.min(cost[i - 1] + minCost[i - 1], cost[i - 2] + minCost[i - 2]);
        }
        return minCost[minCost.length - 1];
    }

}
