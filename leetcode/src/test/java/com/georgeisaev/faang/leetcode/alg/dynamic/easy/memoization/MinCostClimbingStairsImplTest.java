package com.georgeisaev.faang.leetcode.alg.dynamic.easy.memoization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsImplTest {

    @Test
    void minCostClimbingStairs() {
        MinCostClimbingStairs algo = new MinCostClimbingStairsImpl();
        assertEquals(15, algo.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, algo.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

}