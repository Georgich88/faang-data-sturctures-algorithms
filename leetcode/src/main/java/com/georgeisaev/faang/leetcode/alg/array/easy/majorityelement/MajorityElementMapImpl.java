package com.georgeisaev.faang.leetcode.alg.array.easy.majorityelement;

import java.util.HashMap;
import java.util.Map;


public class MajorityElementMapImpl implements MajorityElement {

    @Override
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numberCounter = new HashMap<>();
        final int majorityNumber = nums.length / 2;
        for (int number : nums) {
            numberCounter.putIfAbsent(number, 0);
            numberCounter.compute(number, (k, v) -> v + 1);
            if (numberCounter.get(number) > majorityNumber) {
                return number;
            }
        }
        return 0;
    }

}
