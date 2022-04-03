package com.georgeisaev.faang.leetcode.alg.array.easy.search.missingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberImplTest {

    MissingNumber algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new MissingNumberImpl();
    }

    @Test
    void shouldFindMissingNumber() {
        assertEquals(2, algorithm.missingNumber(new int[]{3, 0, 1}));
    }

}