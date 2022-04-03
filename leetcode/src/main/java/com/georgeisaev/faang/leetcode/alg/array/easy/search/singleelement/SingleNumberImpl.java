package com.georgeisaev.faang.leetcode.alg.array.easy.search.singleelement;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberImpl implements SingleNumber {

    @Override
    public int singleNumber(int[] nums) {
        Set<Integer> single = new HashSet<>();
        Set<Integer> multiple = new HashSet<>();
        for (int number : nums) {
            if (!multiple.contains(number) && single.contains(number)) {
                single.remove(number);
                multiple.add(number);
            } else {
                single.add(number);
            }
        }
        return single.stream().findFirst().orElseThrow();
    }

}
