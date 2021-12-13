package com.georgeisaev.faang.leetcode.alg.array.easy.search.singleelement;

public class SingleNumberSpaceEfficientImpl implements SingleNumber {

    @Override
    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int number : nums) {
            singleNumber ^= number;
        }
        return singleNumber;
    }

}
