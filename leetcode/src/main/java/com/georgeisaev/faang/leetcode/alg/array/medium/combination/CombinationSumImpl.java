package com.georgeisaev.faang.leetcode.alg.array.medium.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumImpl implements CombinationSum {

	@Override
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> combinations = new LinkedList<>();
		backtrack(candidates, target, combinations, target, new LinkedList<>(), 0);
		return combinations;

	}

	void backtrack(int[] candidates, int target, List<List<Integer>> combinations, int remain, List<Integer> combination, int startPosition) {
		if (remain == 0) {
			combinations.add(newCombination(combination));
			return;
		}
		for (int i = startPosition; i < candidates.length; i++) {
			if (candidates[i] > remain) {
				break;
			}
			List<Integer> newCombination = newCombination(combination);
			newCombination.add(candidates[i]);
			backtrack(candidates, target, combinations, remain - candidates[i], newCombination, i);
		}
	}

	static List<Integer> newCombination(List<Integer> combination) {
		return combination.size() > 16 ? new ArrayList<>(combination) : new LinkedList<>(combination);
	}

}
