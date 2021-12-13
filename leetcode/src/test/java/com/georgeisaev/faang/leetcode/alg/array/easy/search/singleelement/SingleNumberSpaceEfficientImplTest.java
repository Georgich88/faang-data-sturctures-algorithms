package com.georgeisaev.faang.leetcode.alg.array.easy.search.singleelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleNumberSpaceEfficientImplTest {
    SingleNumber algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new SingleNumberSpaceEfficientImpl();
    }

    @Test
    void shouldFindSingle() {
        Assertions.assertEquals(1, algorithm.singleNumber(new int[]{2,2,1}));
    }
}
