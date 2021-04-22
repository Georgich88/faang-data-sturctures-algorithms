package com.georgeisaev.faang.leetcode.alg.array.easy.searchinsert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionImplTest {

	SearchInsertPosition algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new SearchInsertPositionImpl();
	}

	@Test
	void shouldSearchInsert() {

		// Example 1:
		//Input: nums = [1,3,5,6], target = 5
		//Output: 2
		assertEquals(2, algorithm.searchInsert(new int[]{1, 3, 5, 6}, 5));

		//Example 2:
		//Input: nums = [1,3,5,6], target = 2
		//Output: 1
		assertEquals(1, algorithm.searchInsert(new int[]{1, 3, 5, 6}, 2));

		//Example 3:
		//Input: nums = [1,3,5,6], target = 7
		//Output: 4
		assertEquals(4, algorithm.searchInsert(new int[]{1, 3, 5, 6}, 7));

		//Example 4:
		//Input: nums = [1,3,5,6], target = 0
		//Output: 0
		assertEquals(0, algorithm.searchInsert(new int[]{1, 3, 5, 6}, 0));

		//Example 5:
		//Input: nums = [1], target = 0
		//Output: 0
		assertEquals(0, algorithm.searchInsert(new int[]{1}, 0));

	}

}
