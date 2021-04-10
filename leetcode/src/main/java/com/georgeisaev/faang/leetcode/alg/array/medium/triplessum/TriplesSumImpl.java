package com.georgeisaev.faang.leetcode.alg.array.medium.triplessum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TriplesSumImpl implements TriplesSum {

	@Override
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length == 0) {
			return Collections.emptyList();
		}
		final List<List<Integer>> triplets = new ArrayList<>();
		final TreeMap<Integer, Integer> uniqueCounter = new TreeMap<>();
		for (int number : nums) {
			uniqueCounter.merge(number, 1, Integer::sum);
		}
		uniqueCounter.forEach((firstNumber, firstCount) -> addNumbers(triplets, uniqueCounter, firstNumber, firstCount));
		return triplets;
	}

	private void addNumbers(final List<List<Integer>> triplets, final TreeMap<Integer, Integer> uniqueCounter,
	                        final int firstNumber, final int firstCount) {
		if (firstCount >= 3 && firstNumber == 0) {
			triplets.add(List.of(firstNumber, firstNumber, firstNumber));
		}
		uniqueCounter.tailMap(firstNumber, false).forEach((secondNumber, secondCount) -> {
			if (firstCount >= 2 && firstNumber * 2 + secondNumber == 0) {
				triplets.add(List.of(firstNumber, firstNumber, secondNumber));
				return;
			}
			if (secondCount >= 2 && firstNumber + secondNumber * 2 == 0) {
				triplets.add(List.of(firstNumber, secondNumber, secondNumber));
				return;
			}
			final int thirdNumber = -firstNumber - secondNumber;
			if (thirdNumber > secondNumber && uniqueCounter.containsKey(thirdNumber)) {
				triplets.add(List.of(firstNumber, secondNumber, thirdNumber));
			}
		});
	}

}
