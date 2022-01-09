package com.georgeisaev.faang.leetcode.alg.array.easy.prefixsum.rangesumquery.immutable;

/**
 * Given an integer array nums, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 *
 * @see <a href=https://leetcode.com/problems/range-sum-query-immutable/>leetcode link<a/>
 */
public interface RangeSumQueryImmutable {

    int sumRange(int left, int right);

}
