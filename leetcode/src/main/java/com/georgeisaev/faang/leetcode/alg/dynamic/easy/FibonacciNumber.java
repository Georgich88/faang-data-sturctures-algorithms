package com.georgeisaev.faang.leetcode.alg.dynamic.easy;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number
 * is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 */
public interface FibonacciNumber {

    /**
     * Calculates n-th Fibonacci number
     *
     * @param n number in Fibonacci sequence
     * @return n-th Fibonacci number
     */
    int fib(int n);

}
