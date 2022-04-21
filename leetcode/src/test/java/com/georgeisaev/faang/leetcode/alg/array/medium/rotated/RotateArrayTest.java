package com.georgeisaev.faang.leetcode.alg.array.medium.rotated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void shouldRotate() {
        RotateArray algo = new RotateArrayExtraSpaceImpl();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        algo.rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
        //
        nums = new int[]{-1, -100, 3, 99};
        algo.rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
        //
        nums = new int[]{1, 2};
        algo.rotate(nums, 3);
        assertArrayEquals(new int[]{2, 1}, nums);
        //
        nums = new int[]{1, 2};
        algo.rotate(nums, 5);
        assertArrayEquals(new int[]{2, 1}, nums);
    }

}