package com.georgeisaev.faang.leetcode.alg.array.medium.foursum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourSumImplTest {

	private FourSum algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new FourSumImpl();
	}

	@Test
	void shouldReturnUniqueQuadruplets() {
		assertEquals(List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1)),
				algorithm.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
		assertEquals(List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1)),
				algorithm.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
		assertEquals(List.of(List.of(2, 2, 2, 2)),
				algorithm.fourSum(new int[]{2, 2, 2, 2, 2}, 8));
		assertEquals(List.of(List.of(-3, -2, 2, 3), List.of(-3, -1, 1, 3), List.of(-3, 0, 0, 3), List.of(-3, 0, 1, 2),
				List.of(-2, -1, 0, 3), List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1)),
				algorithm.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3, 0}, 0));

	}

}
