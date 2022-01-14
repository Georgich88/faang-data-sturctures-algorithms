package com.georgeisaev.faang.leetcode.alg.array.medium.hashtable.sudoku.validsudoku;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidSudokuBitwiseImplTest {

    ValidSudoku algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new ValidSudokuBitwiseImpl();
    }

    @Test
    void isValidSudoku() {


        char[][] sudoku = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        assertTrue(algorithm.isValidSudoku(sudoku));
    }

}