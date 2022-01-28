package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be
 * planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer
 * n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 */
public interface CanPlaceFlowers {

    boolean canPlaceFlowers(int[] flowerbed, int n);

}
