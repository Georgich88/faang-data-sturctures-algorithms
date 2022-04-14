package com.georgeisaev.faang.leetcode.alg.string.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumberImpl implements LetterCombinationsPhoneNumber {

    private static final Map<Character, char[]> lettersByNumber = Map.of(
            '2', "abc".toCharArray(),
            '3', "def".toCharArray(),
            '4', "ghi".toCharArray(),
            '5', "jkl".toCharArray(),
            '6', "mno".toCharArray(),
            '7', "pqrs".toCharArray(),
            '8', "tuv".toCharArray(),
            '9', "wxyz".toCharArray()
    );

    /**
     * {@inheritDoc}
     *
     * @param digits phone digits
     * @return letters' combination
     */
    @Override
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return Collections.emptyList();
        }
        final int capacity = (int) Math.pow(digits.length(), 4);
        List<String> combinations = new ArrayList<>(capacity);
        backtrack(digits, 0, new StringBuilder(), combinations);
        return combinations;
    }

    private static void backtrack(String digits, int position, StringBuilder currentCombination,
                                  List<String> combinations) {
        if (position == digits.length()) {
            combinations.add(currentCombination.toString());
            return;
        }
        char[] letters = lettersByNumber.get(digits.charAt(position));
        for (char letter : letters) {
            currentCombination.append(letter);
            backtrack(digits, position + 1, currentCombination, combinations);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }

}
