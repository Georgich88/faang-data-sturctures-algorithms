package com.georgeisaev.faang.leetcode.alg.array.medium.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2Impl implements CombinationSum2 {

	int[] candidates;
	int target;
	List<List<Integer>> combinations;

	@Override
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		this.combinations = new LinkedList<>();
		this.candidates = candidates;
		this.target = target;
		backtrack(target, new LinkedList<>(), 0);
		return combinations;

	}

	// Runtime: 2 ms, faster than 98.54% of Java online submissions for Combination Sum II.
	//Memory Usage: 38.9 MB, less than 92.58% of Java online submissions for Combination Sum II.

	void backtrack(int remain, List<Integer> combination, int startPosition) {
		if (remain == 0) {
			combinations.add(newCombination(combination));
			return;
		}
		for (int i = startPosition; i < candidates.length; i++) {
			if (candidates[i] > remain) {
				break;
			} else if (i > startPosition && candidates[i] == candidates[i - 1]) {
				continue; // this combination is already computed
			}
			combination.add(candidates[i]);
			backtrack(remain - candidates[i], combination, i + 1);
			combination.remove(combination.size() - 1);
		}
	}

	static List<Integer> newCombination(List<Integer> combination) {
		return combination.size() > 16 ? new ArrayList<>(combination) : new LinkedList<>(combination);
	}

}
