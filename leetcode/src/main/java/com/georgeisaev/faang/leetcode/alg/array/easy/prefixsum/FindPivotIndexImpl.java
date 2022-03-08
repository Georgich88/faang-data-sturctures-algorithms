package com.georgeisaev.faang.leetcode.alg.array.easy.prefixsum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPivotIndexImpl implements FindPivotIndex {

    @Override
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum == totalSum - currentSum - nums[i]) {
                return i;
            }
            currentSum += nums[i];
        }
        return -1;


    }

}

class Solution {

    public static void main(String[] args) {
       int a = 1;
       int b = 0;
       int c = a/b;
        System.out.println(c);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for (char character : letters) {
            if (character > target) {
                return character;
            }
        }
        return target;
    }

    class U {
        void U(){

        }
    }

}