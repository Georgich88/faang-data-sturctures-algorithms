package com.georgeisaev.faang.geekforgeek.binominalcoefficient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinomialCoefficientImplTest {

    @Test
    void shouldComputeBinomialCoefficient() {
        BinomialCoefficient algo = new BinomialCoefficientImpl();
        assertEquals(10, algo.binomialCoefficient(5, 2));
    }

}