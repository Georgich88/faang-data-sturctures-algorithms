package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CanPlaceFlowersImplTest {

    CanPlaceFlowers algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new CanPlaceFlowersImpl();
    }

    @Test
    void shouldPlace() {
        Assertions.assertTrue(algorithm.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    void shouldNotPlace() {
        Assertions.assertFalse(algorithm.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

}