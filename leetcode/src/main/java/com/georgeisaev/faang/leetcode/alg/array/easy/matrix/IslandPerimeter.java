package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

/**
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents
 * water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and
 * there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell
 * is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 */
public interface IslandPerimeter {

    int islandPerimeter(int[][] grid);

}
