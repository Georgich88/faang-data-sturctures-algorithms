package com.georgeisaev.faang.leetcode.alg.math.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerImplTest {

    @Test
    void shouldReverseInteger() {

        ReverseInteger algo = new ReverseIntegerImpl();

        //Example 1:
        //Input: x = 123
        //Output: 321
        assertEquals(321, algo.reverse(123));

        //Example 2:
        //Input: x = -123
        //Output: -321
        assertEquals(-321, algo.reverse(-123));

        //Example 3:
        //Input: x = 120
        //Output: 21
        assertEquals(21, algo.reverse(120));

    }

}