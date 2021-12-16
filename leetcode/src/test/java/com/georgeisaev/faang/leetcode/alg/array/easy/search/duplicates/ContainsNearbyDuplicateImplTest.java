package com.georgeisaev.faang.leetcode.alg.array.easy.search.duplicates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsNearbyDuplicateImplTest {

    ContainsNearbyDuplicate algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new ContainsNearbyDuplicateImpl();
    }

    @Test
    void shouldDefineNearbyDuplicate() {
        assertTrue(algorithm.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(algorithm.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 3));
        assertFalse(algorithm.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

}
