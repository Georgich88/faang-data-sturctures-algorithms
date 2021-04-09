package com.georgeisaev.faang.leetcode.alg.array.medium.triplessum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriplesSumClosestImplTest {

	TriplesSumClosest algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new TriplesSumClosestImpl();
	}

	@Test
	void shouldDefineThreeSumClosest() {
		assertEquals(2,
				algorithm.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
		assertEquals(-1,
				algorithm.threeSumClosest(new int[]{1, 1, -1, -1, 3}, -1));
	}

}
