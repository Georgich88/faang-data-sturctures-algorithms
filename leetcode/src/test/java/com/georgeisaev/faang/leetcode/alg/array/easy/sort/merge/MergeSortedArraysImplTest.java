package com.georgeisaev.faang.leetcode.alg.array.easy.sort.merge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysImplTest {

	MergeSortedArrays algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new MergeSortedArraysImpl();
	}

	@Test
	void shouldFindCombination() {
		int[] nums = new int[]{1, 2, 3, 0, 0, 0};
		algorithm.merge(nums, 3, new int[]{2, 5, 6}, 3);
		assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums);
	}

}
