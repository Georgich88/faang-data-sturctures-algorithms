package com.georgeisaev.faang.leetcode.alg.array.easy.maxSum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayImplTest {

	MaximumSubarray algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new MaximumSubarrayImpl();
	}

	@Test
	void shouldFindMaxSubArraySum() {

		//Example 1:
		//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
		//Output: 6
		//Explanation: [4,-1,2,1] has the largest sum = 6.
		assertEquals(6, algorithm.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

		//Example 2:
		//Input: nums = [1]
		//Output: 1
		assertEquals(1, algorithm.maxSubArray(new int[]{1}));
		assertEquals(-1, algorithm.maxSubArray(new int[]{-1}));

		//Example 3:
		//Input: nums = [5,4,-1,7,8]
		//Output: 23
		assertEquals(23, algorithm.maxSubArray(new int[]{5, 4, -1, 7, 8}));

	}

}
