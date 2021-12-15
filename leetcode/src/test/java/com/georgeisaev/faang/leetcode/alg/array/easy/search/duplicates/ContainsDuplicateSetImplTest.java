package com.georgeisaev.faang.leetcode.alg.array.easy.search.duplicates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateSetImplTest {

    ContainsDuplicate algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new ContainsDuplicateSetImpl();
    }

    @Test
    void shouldDefineDuplicate() {
        Assertions.assertTrue(algorithm.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

}
