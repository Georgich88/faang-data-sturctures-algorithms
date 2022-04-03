package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OneTwoBitCharactersImplTest {

    OneTwoBitCharacters algo;

    @BeforeEach
    void setUp() {
        algo = new OneTwoBitCharactersImpl();
    }

    @Test
    void isOneBitCharacter() {
        Assertions.assertFalse(algo.isOneBitCharacter(new int[]{1, 0, 1, 0}));
    }

}