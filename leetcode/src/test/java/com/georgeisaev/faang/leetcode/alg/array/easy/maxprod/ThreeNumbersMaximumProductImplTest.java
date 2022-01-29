package com.georgeisaev.faang.leetcode.alg.array.easy.maxprod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeNumbersMaximumProductImplTest {

    ThreeNumbersMaximumProduct algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new ThreeNumbersMaximumProductImpl();
    }

    @Test
    void maximumProduct() {
        Assertions.assertEquals(6, algorithm.maximumProduct(new int[]{1, 2, 3}));
        Assertions.assertEquals(24, algorithm.maximumProduct(new int[]{1, 2, 3, 4}));
        Assertions.assertEquals(-6, algorithm.maximumProduct(new int[]{-1, -2, -3}));
    }

}