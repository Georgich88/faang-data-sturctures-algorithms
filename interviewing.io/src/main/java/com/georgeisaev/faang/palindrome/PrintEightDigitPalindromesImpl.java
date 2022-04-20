package com.georgeisaev.faang.palindrome;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class PrintEightDigitPalindromesImpl implements PrintEightDigitPalindromes {

    @Override
    public Collection<Integer> generateEightDigitPalindromes() {
        return IntStream.range(1000, 10000)
                .mapToObj(firstDigits -> firstDigits * 10000 + reverse(firstDigits))
                .collect(Collectors.toList());
    }

    /**
     * Reveres a number
     *
     * @param digits a number to revere
     * @return a revered data
     */
    private int reverse(final int digits) {
        int reversed = 0;
        int remaining = digits;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        PrintEightDigitPalindromes palindromePrinter = new PrintEightDigitPalindromesImpl();
        palindromePrinter.generateEightDigitPalindromes()
                .forEach(System.out::println);
    }

}
