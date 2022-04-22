package com.georgeisaev.faang.leetcode.alg.array.easy.memoization;

import com.georgeisaev.faang.leetcode.alg.dynamic.easy.memoization.ClimbingStairs;
import com.georgeisaev.faang.leetcode.alg.dynamic.easy.memoization.ClimbingStairsMemoizationImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsMemoizationImplTest {

    @Test
    void climbStairs() {
        ClimbingStairs algo = new ClimbingStairsMemoizationImpl();
        assertEquals(2, algo.climbStairs(2));
        assertEquals(3, algo.climbStairs(3));
        assertEquals(5, algo.climbStairs(4));
        assertEquals(144, algo.climbStairs(11));
        assertEquals(1134903170, algo.climbStairs(44));
    }

}