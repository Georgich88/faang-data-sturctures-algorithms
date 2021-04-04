package com.georgeisaev.faang.leetcode.alg.array.easy.removeduplicatesfromsorted;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveDuplicatesFromSortedArrayImplTest {

	RemoveDuplicatesFromSortedArray algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new RemoveDuplicatesFromSortedArrayImpl();
	}

	@Test
	void shouldDeleteUniqueValues1() {
		// Input: nums = [1,1,2]
		// Output: 2, nums = [1,2]
		int[] nums = new int[]{1, 1, 2};
		int length = algorithm.removeDuplicates(nums);
		assertEquals(2, length);
		int[] resultNums = new int[length];
		System.arraycopy(nums, 0, resultNums, 0, length);
		assertTrue(Arrays.equals(new int[]{1, 2}, resultNums));
	}

	@Test
	void shouldDeleteUniqueValues2() {
		// Input: nums = [0,0,1,1,1,2,2,3,3,4]
		// Output: 5, nums = [0,1,2,3,4]
		int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int length = algorithm.removeDuplicates(nums);
		assertEquals(5, length);
		int[] resultNums = new int[length];
		System.arraycopy(nums, 0, resultNums, 0, length);
		assertTrue(Arrays.equals(new int[]{0, 1, 2, 3, 4}, resultNums));
	}

}
