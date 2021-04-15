package com.georgeisaev.faang.leetcode.alg.array.medium.rotated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotatedSortedArraySearchImplTest {

	RotatedSortedArraySearch algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new RotatedSortedArraySearchImpl();
	}

	@Test
	void shouldSearch() {

		// Example 1:
		// Input: nums = [4,5,6,7,0,1,2], target = 0
		// Output: 4
		assertEquals(4, algorithm.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));

		// Example 2:
		// Input: nums = [4,5,6,7,0,1,2], target = 3
		// Output: -1
		assertEquals(-1, algorithm.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

		// Example 3:
		// Input: nums = [1], target = 0
		// Output: -1
		assertEquals(-1, algorithm.search(new int[]{1}, 0));
	}

}
