package com.georgeisaev.faang.leetcode.alg.array.easy.ranges.summary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummaryRangesImplTest {

    SummaryRanges algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new SummaryRangesImpl();
    }

    @Test
    void shouldSummarizeRanges() {
        assertEquals(List.of("0->2", "4->5", "7"), algorithm.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        assertEquals(List.of("0", "2->4", "6", "8->9"),
                algorithm.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
        assertEquals(List.of("-2147483648->-2147483647", "2147483647"),
                algorithm.summaryRanges(new int[]{-2147483648, -2147483647, 2147483647}));
        assertEquals(List.of("-1"), algorithm.summaryRanges(new int[]{-1}));
    }

}