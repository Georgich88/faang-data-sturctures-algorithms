package com.georgeisaev.faang.repartner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers nums and an integer target, return indices of the 2 numbers such that they add up to
 * target
 * You may not use the same number twice
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class Solution {

    public static void main(String[] args) {
        final int[] result = findNumbersEqualTarget(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(result));
    }

    private static final int[] EMPTY_RESULT = new int[0];

    public static int[] findNumbersEqualTarget(int[] nums, int target) {

        // Corner cases check
        if (nums.length < 2) {
            return EMPTY_RESULT;
        }

        // Coping nums for get indexes
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            numbers.add(num);
        }

        // 2N + N * log(N)

        // Sorting nums
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        int left = 0;
        int right = sortedNumbers.size() - 1;
        int[] result = new int[2];

        // nums = [0,3,2,4], target = 6

        while (left < right) {
            final int currentSum = sortedNumbers.get(left) + sortedNumbers.get(right);
            if (currentSum == target) {
                result[0] = numbers.indexOf(sortedNumbers.get(left));
                result[1] = numbers.indexOf(sortedNumbers.get(right));
                return result;
            }
            //
            if (currentSum > target) {
                right--;
            } else {
                left++;
            }
        }

        return EMPTY_RESULT;

    }

}
