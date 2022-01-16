package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.twosum;

/**
 * Accepts a stream of integers and checks if it has a pair of integers that sum up to a particular value.
 */
public interface TwoSumDataStructure {

    /**
     * Adds {@code number} to the data structure
     *
     * @param number a number to add
     */
    void add(int number);

    /**
     * Finds {@code value} in the data structure.
     *
     * @param value a number to find
     * @return {@code true} if there exists any pair of numbers whose sum is equal to {@code value}, otherwise, it
     * returns {@code false}.
     */
    boolean find(int value);

}
