package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

public class ToeplitzMatrixImpl implements ToeplitzMatrix {

    @Override
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int row = 0; row < matrix.length - 1; row++) {
            for(int col = 0; col < matrix[row].length - 1; col++) {
                if (matrix[row][col] != matrix[row + 1 ][col + 1])
                    return false;
            }
        }
        return true;
    }

}
