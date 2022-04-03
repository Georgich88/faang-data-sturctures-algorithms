package com.georgeisaev.faang.leetcode.alg.array.medium.hashtable.sudoku.validsudoku;

import java.util.HashSet;

public class ValidSudokuHashSetImpl implements ValidSudoku {

    private static final int SUDOKU_SIZE = 9;

    @Override
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[SUDOKU_SIZE];
        HashSet<Character>[] columns = new HashSet[SUDOKU_SIZE];
        HashSet<Character>[] boxes = new HashSet[SUDOKU_SIZE];

        for (int i = 0; i < SUDOKU_SIZE; i++) {
            rows[i] = new HashSet<>(SUDOKU_SIZE);
            columns[i] = new HashSet<>(SUDOKU_SIZE);
            boxes[i] = new HashSet<>(SUDOKU_SIZE);
        }

        for (int i = 0; i < SUDOKU_SIZE; i++) {
            for (int j = 0; j < SUDOKU_SIZE; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                // Rows checking
                if (rows[i].contains(board[i][j])) {
                    return false;
                }
                rows[i].add(board[i][j]);
                // Columns checking
                if (columns[j].contains(board[i][j])) {
                    return false;
                }
                columns[j].add(board[i][j]);
                // Boxes checking
                int r = j / 3 + (i / 3) * 3;
                if (boxes[r].contains(board[i][j])) {
                    return false;
                }
                boxes[r].add(board[i][j]);
            }
        }

        return true;
    }

}
