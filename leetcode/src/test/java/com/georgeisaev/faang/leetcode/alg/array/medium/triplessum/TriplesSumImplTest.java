package com.georgeisaev.faang.leetcode.alg.array.medium.triplessum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriplesSumImplTest {

	TriplesSum algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new TriplesSumImpl();
	}

	@Test
	void shouldDefineThreeSum() {
		assertEquals(List.of(List.of(-1, 0, 1), List.of(-1, -1, 2)),
				algorithm.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
	}

}
