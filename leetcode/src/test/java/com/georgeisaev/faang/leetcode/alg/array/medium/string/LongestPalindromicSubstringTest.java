package com.georgeisaev.faang.leetcode.alg.array.medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void shouldFindLongestPalindromicSubstringT() {
        var algo = new LongestPalindromicSubstringImpl();
        assertEquals("bb", algo.longestPalindrome("bb"));
        assertEquals("cc", algo.longestPalindrome("ccd"));
        assertEquals("aba", algo.longestPalindrome("babad"));
        assertEquals("bb", algo.longestPalindrome("cbbd"));
        assertEquals("bb", algo.longestPalindrome("cbbd"));
    }

}