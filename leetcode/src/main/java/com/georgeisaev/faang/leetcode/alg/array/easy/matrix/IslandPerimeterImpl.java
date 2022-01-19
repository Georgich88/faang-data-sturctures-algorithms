package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

public class IslandPerimeterImpl implements IslandPerimeter {

    @Override
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    perimeter += 4;
                    // Up edge
                    if (row > 0 && grid[row - 1][col] == 1) {
                        perimeter--;
                    }
                    // Down edge
                    if (row < grid.length - 1 && grid[row + 1][col] == 1) {
                        perimeter--;
                    }
                    // Left edge
                    if (col > 0 && grid[row][col - 1] == 1) {
                        perimeter--;
                    }
                    // Right edge
                    if (col < grid[row].length - 1 && grid[row][col + 1] == 1) {
                        perimeter--;
                    }
                }
            }
        }
        return perimeter;
    }

}
