package com.georgeisaev.faang.leetcode.alg.math.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageImplTest {

    RotateImage algo;

    @BeforeEach
    void setUp() {
        algo = new RotateImageImpl();
    }

    @Test
    void shouldRotate() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] rotated = {{15,13,2,5}, {14,3,4,1}, {12,6,8,9}, {16,7,10,11}};
        algo.rotate(matrix);
        assertArrayEquals(rotated, matrix);
    }

}