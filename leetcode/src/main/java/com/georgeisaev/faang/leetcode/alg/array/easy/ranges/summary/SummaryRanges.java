package com.georgeisaev.faang.leetcode.alg.array.easy.ranges.summary;

import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 * <p>
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element
 * of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but
 * not in nums.
 * <p>
 * Each range [a,b] in the list should be output as:
 * <p>
 * "a->b" if a != b
 * "a" if a == b
 */
public interface SummaryRanges {

    public List<String> summaryRanges(int[] nums);

}
