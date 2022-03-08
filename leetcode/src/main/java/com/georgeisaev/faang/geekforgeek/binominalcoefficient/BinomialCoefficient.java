package com.georgeisaev.faang.geekforgeek.binominalcoefficient;

import com.georgeisaev.faang.leetcode.alg.Glove;

/**
 * Binomial coefficient
 * <p>
 * <a href=https://www.geeksforgeeks.org/binomial-coefficient-dp-9//>Geeks for Geeks</a> <br/>
 * <a href=https://en.wikipedia.org/wiki/Binomial_coefficient>Wikipedia</a>
 */
@Glove
public interface BinomialCoefficient {

    /** Calculates binomial coefficient
     * @param n
     * @param k
     * @return the binomial coefficient
     */
    int binomialCoefficient(int n, int k);

}
