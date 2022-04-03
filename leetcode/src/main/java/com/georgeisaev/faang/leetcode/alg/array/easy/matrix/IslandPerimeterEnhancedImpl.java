package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

public class IslandPerimeterEnhancedImpl implements IslandPerimeter {

    @Override
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    // Up edge
                    if (row == 0 || grid[row - 1][col] == 0) {
                        perimeter += 2;
                    }
                    // Left edge
                    if (col == 0 || grid[row][col - 1] == 0) {
                        perimeter += 2;
                    }
                }
            }
        }
        return perimeter;
    }

}
