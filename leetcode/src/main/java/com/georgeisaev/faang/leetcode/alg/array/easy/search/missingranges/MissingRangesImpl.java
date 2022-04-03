package com.georgeisaev.faang.leetcode.alg.array.easy.search.missingranges;

import java.util.ArrayList;
import java.util.List;

public class MissingRangesImpl implements MissingRanges {

    @Override
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        if (nums.length == 0) {
            return List.of(formatRange(lower, upper));
        }
        List<String> ranges = new ArrayList<>();
        int left = lower - 1;
        for (int num : nums) {
            if (num - left > 1) {
                ranges.add(formatRange(left + 1, num - 1));
            }
            left = num;
        }
        if (upper != left) {
            ranges.add(formatRange(left + 1, upper));
        }

        return ranges;
    }

    private static String formatRange(int left, int right) {
        if (left == right) {
            return String.valueOf(left);
        }
        return left + "->" + right;
    }

}
