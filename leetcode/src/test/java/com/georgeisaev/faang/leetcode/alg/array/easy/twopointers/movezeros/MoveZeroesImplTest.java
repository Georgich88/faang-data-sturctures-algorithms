package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.movezeros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesImplTest {

    MoveZeroes algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new MoveZeroesImpl();
    }

    @Test
    void shouldMoveZeroes() {
        var nums = new int[]{0, 1, 0, 3, 12};
        algorithm.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

}