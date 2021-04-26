package com.georgeisaev.faang.leetcode.alg.array.medium.combination;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationSum2ImplTest {

	CombinationSum2 algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new CombinationSum2Impl();
	}

	@Test
	void shouldFindCombination() {

		//Example 1:
		//Input: candidates = [10,1,2,7,6,1,5], target = 8
		//Output:
		//[[1,1,6],[1,2,5],[1,7],[2,6]]
		Assertions.assertEquals(List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6)),
				algorithm.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));

		//Example 2:
		//Input: candidates = [2,5,2,1,2], target = 5
		//Output:
		//[[1,2,2],[5]]
		Assertions.assertEquals(List.of(List.of(1, 2, 2), List.of(5)),
				algorithm.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));

	}

}
