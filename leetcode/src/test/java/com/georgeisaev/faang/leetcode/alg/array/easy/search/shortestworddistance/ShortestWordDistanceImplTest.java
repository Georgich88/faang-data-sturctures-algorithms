package com.georgeisaev.faang.leetcode.alg.array.easy.search.shortestworddistance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShortestWordDistanceImplTest {

    ShortestWordDistance algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new ShortestWordDistanceImpl();
    }

    @Test
    void shouldFindShortestDistance() {
        Assertions.assertEquals(3,
                algorithm.shortestDistance(
                        new String[]{"practice", "makes", "perfect", "coding", "makes"},
                        "coding",
                        "practice"));
        Assertions.assertEquals(1,
                algorithm.shortestDistance(
                        new String[]{"practice", "makes", "perfect", "coding", "makes"},
                        "makes",
                        "coding"));
    }

}