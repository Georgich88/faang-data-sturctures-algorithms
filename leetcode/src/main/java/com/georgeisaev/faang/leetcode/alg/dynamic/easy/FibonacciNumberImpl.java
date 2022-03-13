package com.georgeisaev.faang.leetcode.alg.dynamic.easy;

public class FibonacciNumberImpl implements FibonacciNumber {

    /**
     * Calculates n-th Fibonacci number
     *
     * @param n number in Fibonacci sequence
     * @return n-th Fibonacci number
     */
    @Override
    public int fib(int n) {
        // Corner cases
        if (n <= 1) {
            return n;
        }
        int fib = 0; // n-th number
        int fibPrev1 = 1; // (n-1) number
        int fibPrev2 = 0; // (n-2) number
        for (int i = 2; i <= n; i++) {
            fib = fibPrev1 + fibPrev2;
            fibPrev2 = fibPrev1;
            fibPrev1 = fib;
        }
        return fib;
    }

}
