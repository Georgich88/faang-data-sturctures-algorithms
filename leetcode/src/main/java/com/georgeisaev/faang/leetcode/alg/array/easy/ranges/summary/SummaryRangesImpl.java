package com.georgeisaev.faang.leetcode.alg.array.easy.ranges.summary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRangesImpl implements SummaryRanges {

    @Override
    public List<String> summaryRanges(int[] nums) {

        // Corner cases
        if (nums.length == 0) {
            return Collections.emptyList();
        } else if (nums.length == 1) {
            return List.of(String.valueOf(nums[0]));
        }

        // Compute first and medium ranges
        List<String> summaryRanges = new ArrayList<>();
        int left = nums[0];
        int right = left;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] - right != 1) {
                addRange(summaryRanges, left, right);
                left = nums[i];
            }
            right = nums[i];
        }

        // Compute latest range
        final int latest = nums[nums.length - 1];
        if (latest - right != 1) {
            addRange(summaryRanges, left, right);
            left = latest;
        }
        addRange(summaryRanges, left, latest);

        return summaryRanges;
    }

    private void addRange(List<String> summaryRanges, final int left, final int right) {
        if (left == right) {
            summaryRanges.add(String.valueOf(right));
        } else {
            summaryRanges.add(left + "->" + right);
        }
    }

}
