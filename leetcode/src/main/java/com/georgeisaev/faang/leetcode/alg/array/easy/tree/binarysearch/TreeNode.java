package com.georgeisaev.faang.leetcode.alg.array.easy.tree.binarysearch;

import java.util.StringJoiner;

import static java.util.Objects.nonNull;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
		return toString(stringJoiner).toString();
	}

	public StringJoiner toString(StringJoiner stringJoiner) {
		stringJoiner.add(String.valueOf(val));
		if (nonNull(left)) {
			left.toString(stringJoiner);
		}
		if (nonNull(right)) {
			right.toString(stringJoiner);
		} else {
			stringJoiner.add(null);
		}
		return stringJoiner;
	}

}
