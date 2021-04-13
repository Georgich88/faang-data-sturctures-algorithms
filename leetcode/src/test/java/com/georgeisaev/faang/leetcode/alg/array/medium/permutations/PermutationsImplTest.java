package com.georgeisaev.faang.leetcode.alg.array.medium.permutations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationsImplTest {

	Permutations algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new PermutationsImpl();
	}

	@Test
	void shouldPermute() {
		var expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2),
				List.of(3, 2, 1));
		int[] nums = {1, 2, 3};
		var result = algorithm.permute(nums);
		assertEquals(expected.size(), result.size());
		for (var permutation : result) {
			assertTrue(() -> expected.stream().anyMatch(integers -> integers.equals(permutation)));
		}
	}

}
