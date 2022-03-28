package com.georgeisaev.faang.leetcode.alg.string.romannumber;

public class Integer2RomanImpl implements Integer2Roman {

    private static final class RomanNumber {

        private final int value;
        private final String symbol;

        RomanNumber(int value, String symbol) {
            this.value = value;
            this.symbol = symbol;
        }

    }

    private static final RomanNumber[] romanNumbers = {
            numOf(1000, "M"),
            numOf(900, "CM"),
            numOf(500, "D"),
            numOf(400, "CD"),
            numOf(100, "C"),
            numOf(90, "XC"),
            numOf(50, "L"),
            numOf(40, "XL"),
            numOf(10, "X"),
            numOf(9, "IX"),
            numOf(5, "V"),
            numOf(4, "IV"),
            numOf(1, "I")
    };


    static RomanNumber numOf(int value, String symbol) {
        return new RomanNumber(value, symbol);
    }

    /**
     * Converts integer to a roman numeral
     *
     * @param num a number
     * @return a roman numeral
     */
    @Override
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (RomanNumber romanNumber : romanNumbers) {
            while (romanNumber.value <= num) {
                result.append(romanNumber.symbol);
                num -= romanNumber.value;
            }
        }
        return result.toString();
    }

}
