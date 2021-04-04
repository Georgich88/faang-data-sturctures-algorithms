package com.georgeisaev.faang.leetcode.alg.array.hard.median;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSortedArraysMedianImplTest {

	TwoSortedArraysMedian algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new TwoSortedArraysMedianImpl();
	}

	@Test
	void shouldProduceMedian1() {
		assertEquals(2.0, algorithm.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
	}

	@Test
	void shouldProduceMedian2() {
		assertEquals(2.5, algorithm.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
	}

	@Test
	void shouldProduceMedian3() {
		assertEquals(0, algorithm.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));
	}

	@Test
	void shouldProduceMedian4() {
		assertEquals(1, algorithm.findMedianSortedArrays(new int[0], new int[]{1}));
	}

	@Test
	void shouldProduceMedian5() {
		assertEquals(2.0, algorithm.findMedianSortedArrays(new int[]{2}, new int[0]));
	}


}
