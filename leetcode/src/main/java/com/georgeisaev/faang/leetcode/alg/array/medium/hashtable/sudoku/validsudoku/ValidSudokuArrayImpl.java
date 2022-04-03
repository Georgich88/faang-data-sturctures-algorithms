package com.georgeisaev.faang.leetcode.alg.array.medium.hashtable.sudoku.validsudoku;

public class ValidSudokuArrayImpl implements ValidSudoku {

    private static final int SUDOKU_SIZE = 9;

    /**
     * @param board
     * @return
     */
    @Override
    public boolean isValidSudoku(char[][] board) {

        int[][] rows = new int[SUDOKU_SIZE][SUDOKU_SIZE];
        int[][] columns = new int[SUDOKU_SIZE][SUDOKU_SIZE];
        int[][] boxes = new int[SUDOKU_SIZE][SUDOKU_SIZE];

        for (int i = 0; i < SUDOKU_SIZE; i++) {
            for (int j = 0; j < SUDOKU_SIZE; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                // Storing numbers from 1-9 as array elements 0-8 respectively
                int cell = board[i][j] - '1';

                // Verify rows
                if (rows[i][cell] == 1) {
                    return false;
                }
                rows[i][cell] = 1;

                // Verify columns
                if (columns[j][cell] == 1) {
                    return false;
                }
                columns[j][cell] = 1;

                // Verify boxes
                int boxIdx = (i / 3) * 3 + (j / 3);
                if (boxes[boxIdx][cell] == 1) {
                    return false;
                }
                boxes[boxIdx][cell] = 1;

            }
        }

        return true;

    }

}
