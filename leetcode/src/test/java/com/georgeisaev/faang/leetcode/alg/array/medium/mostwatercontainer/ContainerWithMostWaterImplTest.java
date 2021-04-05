package com.georgeisaev.faang.leetcode.alg.array.medium.mostwatercontainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterImplTest {

	ContainerWithMostWater algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new ContainerWithMostWaterImpl();
	}

	@Test
	void shouldDefineMaxArea() {
		assertEquals(49, algorithm.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
		assertEquals(1, algorithm.maxArea(new int[]{1, 1}));
		assertEquals(16, algorithm.maxArea(new int[]{4, 3, 2, 1, 4}));
		assertEquals(2, algorithm.maxArea(new int[]{1, 2, 1}));
	}

}
