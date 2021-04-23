package com.georgeisaev.faang.leetcode.alg.array.medium.combination;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationSumImplTest {

	CombinationSum algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new CombinationSumImpl();
	}

	@Test
	void shouldFindCombination() {

		// Example 1:
		//Input: candidates = [2,3,6,7], target = 7
		//Output: [[2,2,3],[7]]
		//Explanation:
		//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
		//7 is a candidate, and 7 = 7.
		//These are the only two combinations.
		Assertions.assertEquals(List.of(List.of(2, 2, 3), List.of(7)),
				algorithm.combinationSum(new int[]{2, 3, 6, 7}, 7));

		//Example 2:
		//Input: candidates = [2,3,5], target = 8
		//Output: [[2,2,2,2],[2,3,3],[3,5]]
		Assertions.assertEquals(List.of(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5)),
				algorithm.combinationSum(new int[]{2,3,5}, 8));

		//Example 3:
		//Input: candidates = [2], target = 1
		//Output: []
		Assertions.assertEquals(List.of(List.of(2, 2, 3), List.of(7)),
				algorithm.combinationSum(new int[]{2, 3, 6, 7}, 7));

		//Example 4:
		//Input: candidates = [1], target = 1
		//Output: [[1]]
		Assertions.assertEquals(List.of(List.of(1)), algorithm.combinationSum(new int[]{1}, 1));
		//Example 5:
		//Input: candidates = [1], target = 2
		//Output: [[1,1]]
		Assertions.assertEquals(List.of(List.of(1, 1)), algorithm.combinationSum(new int[]{1}, 2));
	}

}
