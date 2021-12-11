package com.georgeisaev.faang.leetcode.alg.array.easy.pascal.triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleImpl implements PascalTriangle {

	@Override
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		triangle.add(List.of(1));
		for (int i = 1; i < numRows; i++) {
			Integer[] row = new Integer[i + 1];
			row[0] = 1;
			row[row.length - 1] = 1;
			int left = 1;
			int right = row.length - 2;
			while (left <= right) {
				row[left] = triangle.get(i - 1).get(left - 1) + triangle.get(i - 1).get(left);
				if (left != right) {
					row[right] = triangle.get(i - 1).get(right - 1) + triangle.get(i - 1).get(right);
				}
				left++;
				right--;
			}
			triangle.add(Arrays.asList(row));
		}
		return triangle;
	}

}
