package com.georgeisaev.faang.leetcode.alg.array.easy.search.missingranges;

import java.util.List;

/**
 * You are given an inclusive range [lower, upper] and a sorted unique integer array nums, where all elements are in
 * the inclusive range.
 * <p>
 * A number x is considered missing if x is in the range [lower, upper] and x is not in nums.
 * <p>
 * Return the smallest sorted list of ranges that cover every missing number exactly. That is, no element of nums is
 * in any of the ranges, and each missing number is in one of the ranges.
 * <p>
 * Each range [a,b] in the list should be output as:
 * <pre>
 * "a->b" if a != b
 * "a" if a == b
 * </pre>
 *
 * <a href=https://leetcode.com/problems/missing-ranges/>leetcode link</a>
 */
public interface MissingRanges {

    List<String> findMissingRanges(int[] nums, int lower, int upper);

}
