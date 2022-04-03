package com.georgeisaev.faang.leetcode.alg.array.easy.twosum;

import com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.twosum.TwoSumOrdered;
import com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.twosum.TwoSumOrderedTwoPointersImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumOrderedTwoPointersImplTest {

    TwoSumOrdered algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new TwoSumOrderedTwoPointersImpl();
    }

    @Test
    void shouldFindTarget() {
        Assertions.assertArrayEquals(new int[]{1, 2}, algorithm.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

}
