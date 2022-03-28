package com.georgeisaev.faang.leetcode.alg.string.romannumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Integer2RomanImplTest {

    Integer2Roman algo;

    @BeforeEach
    void setUp() {
        algo = new Integer2RomanImpl();
    }

    @Test
    void shouldConvertInteger2Roman() {
        Assertions.assertEquals("III", algo.intToRoman(3));
        Assertions.assertEquals("LVIII", algo.intToRoman(58));
        Assertions.assertEquals("MCMXCIV", algo.intToRoman(1994));
    }

}