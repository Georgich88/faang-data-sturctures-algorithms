package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

/**
 * We have two special characters:
 * <p>
 * The first character can be represented by one bit 0.
 * The second character can be represented by two bits (10 or 11).
 * <p>
 * Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
 */
public interface OneTwoBitCharacters {

    boolean isOneBitCharacter(int[] bits);

}
