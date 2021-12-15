package com.georgeisaev.faang.leetcode.alg.array.easy.majorityelement;

import java.util.Arrays;

public class MajorityElementImpl implements MajorityElement {

    public static void main(String[] args) {
        new MajorityElementImpl().majorityElement(new int[]{1});
    }

    @Override
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int currentNumber = nums[0];
        int currentCount = 1;
        final int majorityCount = nums.length / 2;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNumber) {
                currentCount++;
                if (currentCount > majorityCount) {
                    return currentNumber;
                }
            } else {
                currentNumber = nums[i];
                currentCount = 1;
            }
        }
        return currentNumber;
    }

}
