package com.georgeisaev.faang.leetcode.alg.array.medium.hashtable.sudoku.validsudoku;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following
 * rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * <p>
 * <a href=https://leetcode.com/problems/valid-sudoku/>leetcode link</a>
 */
public interface ValidSudoku {

    boolean isValidSudoku(char[][] board);

}
