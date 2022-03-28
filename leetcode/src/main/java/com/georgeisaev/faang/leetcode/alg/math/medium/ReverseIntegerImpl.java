package com.georgeisaev.faang.leetcode.alg.math.medium;

public class ReverseIntegerImpl implements ReverseInteger {

    @Override
    public int reverse(int x) {
        long reversed = 0;
        int reminder = x;
        while (reminder != 0) {
            reversed = reversed * 10 + reminder % 10;
            reminder /= 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }

}
