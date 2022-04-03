package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class ValidWordSquareImplTest {

    ValidWordSquare algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new ValidWordSquareImpl();
    }

    @Test
    void shouldVerifyInvalidWordSquare() {
        Assertions.assertFalse(algorithm.validWordSquare(List.of("abc", "b")));
        Assertions.assertFalse(algorithm.validWordSquare(List.of("ball","area","read","lady")));
    }

    @Test
    void shouldVerifyValidWordSquare() {
        Assertions.assertTrue(algorithm.validWordSquare(List.of("abcd","bnrt","crmy","dtye")));
        Assertions.assertTrue(algorithm.validWordSquare(List.of("abcd","bnrt","crm","dt")));
    }

}