package com.georgeisaev.faang.leetcode.alg.array.medium.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixImplTest {

    @Test
    void shouldSearchMatrix() {
        Search2DMatrix algo = new Search2DMatrixImpl();
        assertTrue(algo.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    }

}