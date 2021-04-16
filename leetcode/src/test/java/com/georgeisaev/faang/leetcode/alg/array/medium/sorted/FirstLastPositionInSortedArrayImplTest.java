package com.georgeisaev.faang.leetcode.alg.array.medium.sorted;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FirstLastPositionInSortedArrayImplTest {

	FirstLastPositionInSortedArray algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new FirstLastPositionInSortedArrayImpl();
	}

	@Test
	void searchRange() {

		//Example 1:
		//Input: nums = [5,7,7,8,8,10], target = 8
		//Output: [3,4]
		assertArrayEquals(new int[]{3, 4}, algorithm.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));

		//Example 2:
		//Input: nums = [5,7,7,8,8,10], target = 6
		//Output: [-1,-1]
		assertArrayEquals(new int[]{-1, -1}, algorithm.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));

		//Example 3:
		//Input: nums = [], target = 0
		//Output: [-1,-1]
		assertArrayEquals(new int[]{-1, -1}, algorithm.searchRange(new int[0], 0));
	}

}
