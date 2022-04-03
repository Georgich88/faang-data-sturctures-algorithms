package com.georgeisaev.faang.leetcode.alg.array.easy.pascal.triangle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangleRowRecursiveImpl implements PascalTriangleRow {

	@Override
	public List<Integer> getRow(int rowIndex) {
		int[] row = new int[rowIndex + 1];
		row[0] = 1;
		row[row.length - 1] = 1;
		if (rowIndex >= 2) {
			row[1] = rowIndex;
			row[row.length - 2] = rowIndex;
		}
		int left = 2;
		final int middle = row.length / 2;
		while (left <= middle) {
			row[left] = left == 1 ? rowIndex : calculateTriangleElement(rowIndex, left);
			row[row.length - 1 - left] = row[left]; // right element
			left++;
		}
		return Arrays.stream(row).boxed().collect(Collectors.toList());
	}

	private int calculateTriangleElement(final int rowIndex, final int columnIndex) {
		if (columnIndex == 0 || columnIndex == rowIndex) {
			return 1;
		}
		if (columnIndex == 1 || columnIndex == rowIndex - 1) {
			return rowIndex;
		}
		return calculateTriangleElement(rowIndex - 1, columnIndex)
				+ calculateTriangleElement(rowIndex - 1, columnIndex - 1);

	}

}
