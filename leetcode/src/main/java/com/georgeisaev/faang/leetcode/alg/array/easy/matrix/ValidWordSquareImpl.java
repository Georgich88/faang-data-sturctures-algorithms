package com.georgeisaev.faang.leetcode.alg.array.easy.matrix;

import java.util.List;

public class ValidWordSquareImpl implements ValidWordSquare {

    @Override
    public boolean validWordSquare(List<String> words) {
        for (int row = 0; row < words.size(); row++) {
            for (int col = 0; col < words.get(row).length(); col++) {
                if (col + 1 > words.size() || words.get(col).length() < row + 1) {
                    return false;
                }
                if (words.get(row).charAt(col) != words.get(col).charAt(row)) {
                    return false;
                }
            }
        }
        return true;
    }

}
