package com.georgeisaev.faang.leetcode.alg.array.easy.search.duplicates;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSetImpl implements ContainsDuplicate {

    @Override
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int number : nums) {
            if (!uniqueNums.add(number)) {
                return true;
            }
        }
        return false;
    }

}
