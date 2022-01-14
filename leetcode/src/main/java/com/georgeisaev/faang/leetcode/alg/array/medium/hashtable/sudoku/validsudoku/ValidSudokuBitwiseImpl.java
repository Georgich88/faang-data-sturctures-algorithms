package com.georgeisaev.faang.leetcode.alg.array.medium.hashtable.sudoku.validsudoku;

public class ValidSudokuBitwiseImpl implements ValidSudoku {

    private static final int SUDOKU_SIZE = 9;

    @Override
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[SUDOKU_SIZE];
        int[] columns = new int[SUDOKU_SIZE];
        int[] boxes = new int[SUDOKU_SIZE];

        for (int i = 0; i < SUDOKU_SIZE; i++) {
            for (int j = 0; j < SUDOKU_SIZE; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                // Storing numbers from 1-9 as bits 0-8 respectively bitwise
                // 2 in i-th row would be: 00000010
                int cell = 1 << (board[i][j] - '1');

                // Verify rows
                if ((rows[i] & cell) > 0) {
                    return false;
                }
                rows[i] |= cell;

                // Verify columns
                if ((columns[j] & cell) > 0) {
                    return false;
                }
                columns[j] |= cell;

                // Verify boxes
                int boxIdx = (i / 3) * 3 + (j / 3);
                if ((boxes[boxIdx] & cell) > 0) {
                    return false;
                }
                boxes[boxIdx] |= cell;

            }
        }

        return true;
    }

}
