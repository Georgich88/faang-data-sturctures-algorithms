package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

/**
 * An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the
 * average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother). If
 * one or more of the surrounding cells of a cell is not present, we do not consider it in the average (i.e., the
 * average of the four cells in the red smoother).
 */
public interface ImageSmoother {

    int[][] imageSmoother(int[][] img);

}
