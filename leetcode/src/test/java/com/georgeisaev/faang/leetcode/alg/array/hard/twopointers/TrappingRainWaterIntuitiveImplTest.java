package com.georgeisaev.faang.leetcode.alg.array.hard.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterIntuitiveImplTest {

	TrappingRainWater algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new TrappingRainWaterIntuitiveImpl();
	}

	@Test
	void shouldCalculateTrappingRainWaterVolume() {
		assertEquals(9, algorithm.trap(new int[]{4, 2, 0, 3, 2, 5}));
		//assertEquals(6, algorithm.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
	}

}
