package com.georgeisaev.faang.leetcode.alg.array.medium.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FourSumImpl implements FourSum {

	@Override
	public List<List<Integer>> fourSum(int[] nums, int target) {
		// Corner cases
		if (nums.length < 4) {
			return Collections.emptyList();
		} else if (nums.length == 4) {
			if (nums[0] + nums[1] + nums[2] + nums[3] == target) {
				return List.of(List.of(nums[0], nums[1], nums[2], nums[3]));
			} else {
				return Collections.emptyList();
			}
		}
		// Presorting
		Arrays.sort(nums);
		// Resulting list
		List<List<Integer>> quadruplets = new ArrayList<>();
		// Auxiliary structures to track quadruplets' uniqueness
		Map<Integer, Map<Integer, Set<Integer>>> triples = new TreeMap<>();
		Map<Integer, Set<Integer>> doubles;
		Set<Integer> numbers;
		int sum;
		// Indices of terms
		int a;
		int b;
		int c;
		int d;
		for (a = 0; a < nums.length; a++) {
			for (b = a + 1; b < nums.length - 2; b++) {
				c = b + 1;
				d = nums.length - 1;
				while (c < d) {
					sum = nums[a] + nums[b] + nums[c] + nums[d];
					if (sum == target) {
						doubles = triples.get(nums[a]);
						numbers = doubles == null ? null : doubles.get(nums[b]);
						if (doubles == null || numbers == null || !numbers.contains(nums[c])) {
							quadruplets.add(List.of(nums[a], nums[b], nums[c], nums[d]));
							if (doubles == null) {
								doubles = new TreeMap<>();
								triples.put(nums[a], doubles);
							}
							if (numbers == null) {
								numbers = new TreeSet<>();
								doubles.put(nums[b], numbers);
							}
							numbers.add(nums[c]);
						}
						d--;
						c++;
					} else if (sum > target) {
						d--;
					} else {
						c++;
					}
				}
			}
		}
		return quadruplets;
	}

}
