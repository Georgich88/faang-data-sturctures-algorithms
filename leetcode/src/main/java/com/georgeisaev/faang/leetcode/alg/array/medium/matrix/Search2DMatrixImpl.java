package com.georgeisaev.faang.leetcode.alg.array.medium.matrix;

public class Search2DMatrixImpl implements Search2DMatrix {

    @Override
    public boolean searchMatrix(int[][] matrix, int target) {

        final int row = matrix.length;
        final int column = matrix[0].length;

        int left = 0;
        int right = row * column - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int value = matrix[middle / column][middle % column];
            if (value > target) {
                right = middle - 1;
            } else if (value < target) {
                left = middle + 1;
            } else {
                return true;
            }
        }

        return false;

    }

}
