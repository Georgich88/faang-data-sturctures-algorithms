package com.georgeisaev.faang.leetcode.alg.array.medium.permutations;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PermutationsImpl implements Permutations {

	@Override
	public List<List<Integer>> permute(int[] nums) {
		Deque<Integer> numbers = new LinkedList<>();
		for (int num : nums){
			numbers.add(num);
		}
		return permute(numbers);
	}

	private List<List<Integer>> permute(Deque<Integer> nums) {
		if (nums.size() == 1){
			return List.of(new LinkedList<>(nums));
		}
		List<List<Integer>> result = new LinkedList<>();
		Integer num;
		for (int i = 0; i < nums.size(); i++) {
			num = nums.pop();
			List<List<Integer>> perms = permute(new LinkedList<>(nums));
			for (var perm : perms){
				perm.add(num);
			}
			nums.add(num);
			result.addAll(perms);
		}
		return result;
	}

}
