package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArraySquaresImplTest {

    @Test
    void shouldCreateSortedSquares() {
        SortedArraySquares algo = new SortedArraySquaresImpl();
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, algo.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, algo.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

}