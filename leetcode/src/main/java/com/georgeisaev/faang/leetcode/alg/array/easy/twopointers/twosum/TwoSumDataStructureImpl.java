package com.georgeisaev.faang.leetcode.alg.array.easy.twopointers.twosum;

import java.util.Map;
import java.util.TreeMap;

public class TwoSumDataStructureImpl implements TwoSumDataStructure {

    private final Map<Integer, Integer> countByNumber;

    public TwoSumDataStructureImpl() {
        countByNumber = new TreeMap<>();
    }

    @Override
    public void add(int number) {
        countByNumber.merge(number, 1, Integer::sum);
    }

    @Override
    public boolean find(int value) {
        if (countByNumber.size() == 0) {
            return false;
        }
        for (var numberCount : countByNumber.entrySet()) {
            final int complement = value - numberCount.getKey();
            if (complement == numberCount.getKey()
                    ? numberCount.getValue() > 1
                    : countByNumber.containsKey(complement)) {
                return true;
            }
        }
        return false;
    }

}
