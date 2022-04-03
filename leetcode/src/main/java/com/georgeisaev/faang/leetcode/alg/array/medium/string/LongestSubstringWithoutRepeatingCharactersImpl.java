package com.georgeisaev.faang.leetcode.alg.array.medium.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersImpl implements LongestSubstringWithoutRepeatingCharacters {

    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param s a given string
     * @return the longest substring without repeating characters
     */
    @Override
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int result = 0;
        Map<Character, Integer> countBySubstringChar = new HashMap<>();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            countBySubstringChar.merge(rightChar, 1, Integer::sum);
            while (countBySubstringChar.get(rightChar) > 1) {
                char leftChar = s.charAt(left);
                countBySubstringChar.merge(leftChar, -1, Integer::sum);
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }

}
