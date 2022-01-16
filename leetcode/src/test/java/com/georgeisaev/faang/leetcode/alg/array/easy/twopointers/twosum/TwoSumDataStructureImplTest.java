package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumDataStructureImplTest {

    TwoSumDataStructure twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSumDataStructureImpl();
    }

    @Test
    void shouldAdd() {
        Assertions.assertDoesNotThrow(() -> twoSum.add(1));
    }

    @Test
    void shouldFind() {
        twoSum.add(1);   // [] --> [1]
        twoSum.add(3);   // [1] --> [1,3]
        twoSum.add(5);   // [1,3] --> [1,3,5]
        Assertions.assertTrue(twoSum.find(4)); // 1 + 3 = 4, return true
        Assertions.assertFalse(twoSum.find(7)); // No two integers sum up to 7, return false
    }

}