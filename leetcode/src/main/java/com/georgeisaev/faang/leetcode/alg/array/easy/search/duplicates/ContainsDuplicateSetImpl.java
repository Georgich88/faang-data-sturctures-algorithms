package com.georgeisaev.faang.leetcode.alg.array.easy.search.duplicates;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicateSetImpl implements ContainsDuplicate {

    @Override
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length != uniqueNums.size();
    }

}
