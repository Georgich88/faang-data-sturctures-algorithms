package com.georgeisaev.faang.leetcode.alg.array.easy.pascal.triangle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangleRowImpl implements PascalTriangleRow {

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
            row[left] = rowIndex < 29
                    ? row[left - 1] * (rowIndex - left + 1) / left
                    : (int) (((long) row[left - 1] * (rowIndex - left + 1)) / left); // int overflow workaround
            row[row.length - 1 - left] = row[left]; // right element
            left++;
        }
        return Arrays.stream(row).boxed().collect(Collectors.toList());
    }

}
