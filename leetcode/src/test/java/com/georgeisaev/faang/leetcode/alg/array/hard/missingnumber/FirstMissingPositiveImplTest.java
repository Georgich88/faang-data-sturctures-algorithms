package com.georgeisaev.faang.leetcode.alg.array.hard.missingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstMissingPositiveImplTest {

	FirstMissingPositive algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new FirstMissingPositiveImpl();
	}

	@Test
	void shouldFirstMissingPositive() {

		// Example 1:
		// Input: nums = [1,2,0]
		// Output: 3
		assertEquals(3, algorithm.firstMissingPositive(new int[]{1, 2, 0}));

		// Example 2:
		// Input: nums = [3,4,-1,1]
		// Output: 2
		assertEquals(2, algorithm.firstMissingPositive(new int[]{3, 4, -1, 1}));

		// Example 3:
		// Input: nums = [7,8,9,11,12]
		// Output: 1
		assertEquals(1, algorithm.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
	}

}
