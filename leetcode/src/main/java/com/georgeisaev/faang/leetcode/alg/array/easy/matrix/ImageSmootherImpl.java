package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

public class ImageSmootherImpl implements ImageSmoother {

    @Override
    public int[][] imageSmoother(int[][] img) {
        final int[][] rounded = new int[img.length][img[0].length];
        final int rowEdge = img.length - 1;
        final int columnEdge = img[0].length - 1;
        for (int i = 0; i < img.length; i++) {
            System.arraycopy(img[i], 0, rounded[i], 0, img[i].length);
            for (int j = 0; j < img[i].length; j++) {
                int count = 1;
                if (j > 0 && i > 0) { //
                    rounded[i][j] += img[i - 1][j - 1];
                    count++;
                }
                if (i > 0) {
                    rounded[i][j] += img[i - 1][j];
                    count++;
                }
                if (j > 0) {
                    rounded[i][j] += img[i][j - 1];
                    count++;
                }
                if (j < columnEdge) {
                    rounded[i][j] += img[i][j + 1];
                    count++;
                }
                if (i < rowEdge) {
                    rounded[i][j] += img[i + 1][j];
                    count++;
                }
                if (j < columnEdge && i < rowEdge) {
                    rounded[i][j] += img[i + 1][j + 1];
                    count++;
                }
                if (j > 0 && i < rowEdge) {
                    rounded[i][j] += img[i + 1][j - 1];
                    count++;
                }
                if (j < columnEdge && i > 0) {
                    rounded[i][j] += img[i - 1][j + 1];
                    count++;
                }
                rounded[i][j] /= count;

            }
        }
        return rounded;
    }

}
