package com.georgeisaev.faang.leetcode.alg.math.medium;

public class RotateImageImpl implements RotateImage {

    /**
     * Rotates the N x N matrix
     *
     * <pre>
     * Before
     * 0 1 2
     * 3 4 5
     * 6 7 8
     *
     * After
     * 6 3 0
     * 7 4 1
     * 8 5 2
     * </pre>
     */
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    /**
     * Transposes the N x N matrix
     *
     * <pre>
     * Before
     * 0 1 2
     * 3 4 5
     * 6 7 8
     *
     * After
     * 0 3 6
     * 1 4 7
     * 2 5 8
     * </pre>
     */
    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j > i; j--) {
                if (matrix[i][j] == matrix[j][i]) continue;
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     * Reverses the N x N matrix
     *
     * <pre>
     * Before
     * 0 3 6
     * 1 4 7
     * 2 5 8
     *
     * After
     * 6 3 0
     * 7 4 1
     * 8 5 2
     * </pre>
     */
    public static void reverse(int[][] matrix) {
        final int size = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                matrix[i][j] ^= matrix[i][size-j-1];
                matrix[i][size-j-1] ^= matrix[i][j];
                matrix[i][j] ^= matrix[i][size-j-1];
            }
        }
    }

}
