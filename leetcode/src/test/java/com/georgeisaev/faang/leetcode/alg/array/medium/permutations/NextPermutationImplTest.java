package com.georgeisaev.faang.leetcode.alg.array.medium.permutations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationImplTest {

	NextPermutation algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new NextPermutationImpl();
	}

	@Test
	void shouldFindClosestPermutation(){

		// Example 1:
		//Input: nums = [1,2,3]
		//Output: [1,3,2]
		int [] nums = new int[]{1,2,3};
		algorithm.nextPermutation(nums);
		assertArrayEquals(new int[]{1,3,2}, nums);

		//Example 2:
		//Input: nums = [3,2,1]
		//Output: [1,2,3]
		nums = new int[]{3,2,1};
		algorithm.nextPermutation(nums);
		assertArrayEquals(new int[]{1,2,3}, nums);

		//Example 3:
		//Input: nums = [1,1,5]
		//Output: [1,5,1]
		nums = new int[]{1,1,5};
		algorithm.nextPermutation(nums);
		assertArrayEquals(new int[]{1,5,1}, nums);

		//Example 4:
		//Input: nums = [1]
		//Output: [1]
		nums = new int[]{1};
		algorithm.nextPermutation(nums);
		assertArrayEquals(new int[]{1}, nums);
	}

}
