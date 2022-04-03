package com.georgeisaev.faang.leetcode.alg.array.easy.search.duplicates;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicateImpl implements ContainsNearbyDuplicate {

    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> distanceByUniqueNumber = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer left = distanceByUniqueNumber.put(nums[i], i);
            if (left != null && (i - left) <= k) {
                return true;
            }
        }
        return false;
    }

}
