package com.georgeisaev.faang.leetcode.alg.array.easy.twosum;

import java.util.NoSuchElementException;

public class TwoSumOrderedTwoPointersImpl implements TwoSumOrdered {

    @Override
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int sum;

        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        throw new NoSuchElementException("Sum equal to target cannot be found");
    }

}
