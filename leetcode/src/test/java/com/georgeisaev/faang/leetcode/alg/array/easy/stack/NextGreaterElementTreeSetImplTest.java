package com.georgeisaev.faang.leetcode.alg.array.easy.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NextGreaterElementTreeSetImplTest {

    NextGreaterElement algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new NextGreaterElementTreeSetImpl();
    }

    @Test
    void shouldFindNextGreaterElements() {
        Assertions.assertArrayEquals(new int[]{7, 7, 7, 7, 7},
                algorithm.nextGreaterElement(
                        new int[]{1, 3, 5, 2, 4},
                        new int[]{6, 5, 4, 3, 2, 1, 7}));
        Assertions.assertArrayEquals(new int[]{-1, 3, -1},
                algorithm.nextGreaterElement(
                        new int[]{4, 1, 2},
                        new int[]{1, 3, 4, 2}));
    }

}