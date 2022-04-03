package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

import java.util.List;

/**
 * Given an array of strings words, return true if it forms a valid word square.
 * <p>
 * A sequence of strings forms a valid word square if the kth row and column read the same string, where 0 <= k < max
 * (numRows, numColumns).
 */
public interface ValidWordSquare {

    /**
     * Verifies a valid word square
     *
     * @param words array of words to verify
     * @return true if it forms a valid word square
     */
    boolean validWordSquare(List<String> words);

}
