package com.georgeisaev.faang.leetcode.alg.array.medium.string;

public class LongestPalindromicSubstringImpl implements LongestPalindromicSubstring {

    /**
     * Returns the longest palindromic substring in s.
     *
     * @param s a given string
     * @return the longest palindromic substring
     */
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int length = maxPalindromeLength(s, i);
            if (length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int maxPalindromeLength(String s, int center) {
        return Math.max(maxEvenPalindromeLength(s, center), maxOddPalindromeLength(s, center));
    }

    private static int maxEvenPalindromeLength(String s, int center) {
        int left = center;
        int right = center + 1;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    private static int maxOddPalindromeLength(String s, int center) {
        int left = center;
        int right = center;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
