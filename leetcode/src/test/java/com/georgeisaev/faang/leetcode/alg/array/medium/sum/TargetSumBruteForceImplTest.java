package com.georgeisaev.faang.leetcode.alg.array.medium.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetSumBruteForceImplTest {

    @Test
    void findTargetSumWays() {
        TargetSum algo = new TargetSumBruteForceImpl();
        assertEquals(5, algo.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(1, algo.findTargetSumWays(new int[]{1}, 1));
    }

}