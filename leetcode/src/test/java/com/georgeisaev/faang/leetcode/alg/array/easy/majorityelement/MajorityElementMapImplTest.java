package com.georgeisaev.faang.leetcode.alg.array.easy.majorityelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementMapImplTest {

    MajorityElement algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new MajorityElementMapImpl();
    }

    @Test
    void shouldFindMajorityElement() {
        assertEquals(2, algorithm.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

}
