package com.georgeisaev.faang.leetcode.alg.array.medium.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersImplTest {

    @Test
    void shouldFindLongestSubstring() {

        LongestSubstringWithoutRepeatingCharacters algo = new LongestSubstringWithoutRepeatingCharactersImpl();

        // Example 1:
        //Input: s = "abcabcbb"
        //Output: 3
        //Explanation: The answer is "abc", with the length of 3.
        Assertions.assertEquals(3, algo.lengthOfLongestSubstring("abcabcbb"));

        //Example 2:
        //Input: s = "bbbbb"
        //Output: 1
        //Explanation: The answer is "b", with the length of 1.
        Assertions.assertEquals(1, algo.lengthOfLongestSubstring("bbbbb"));

        //Example 3:
        //Input: s = "pwwkew"
        //Output: 3
        //Explanation: The answer is "wke", with the length of 3.
        //Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
        Assertions.assertEquals(3, algo.lengthOfLongestSubstring("pwwkew"));
    }

}