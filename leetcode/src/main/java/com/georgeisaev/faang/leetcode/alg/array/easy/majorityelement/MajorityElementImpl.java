package com.georgeisaev.faang.leetcode.alg.array.easy.majorityelement;

public class MajorityElementImpl implements MajorityElement {

    public static void main(String[] args) {
        new MajorityElementImpl().majorityElement(new int[]{1});
    }

    @Override
    public int majorityElement(int[] nums) {
        int currentNumber = nums[0];
        int currentCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNumber) {
                currentCount++;
            } else {
                currentCount--;
            }
            if (currentCount == 0) {
                currentNumber = nums[i];
                currentCount = 1;
            }
        }
        return currentNumber;
    }

}
