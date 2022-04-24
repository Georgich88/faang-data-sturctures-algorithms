package com.georgeisaev.faang.leetcode.alg.array.medium.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberImplTest {

    @Test
    void shouldFindMaxAmountToRob_1() {
        HouseRobber algo = new HouseRobberImpl();
        assertEquals(4, algo.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, algo.rob(new int[]{2,7,9,3,1}));
    }

}