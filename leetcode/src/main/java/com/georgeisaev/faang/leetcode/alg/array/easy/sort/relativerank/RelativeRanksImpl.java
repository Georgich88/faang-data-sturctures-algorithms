package com.georgeisaev.faang.leetcode.alg.array.easy.sort.relativerank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanksImpl implements RelativeRanks {

    @Override
    public String[] findRelativeRanks(int[] score) {
        int[] sortedScore = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScore);
        Map<Integer, String> placeByScore = new HashMap<>();
        for (int i = 0; i < sortedScore.length; i++) {
            if (i == sortedScore.length - 1) {
                placeByScore.put(sortedScore[i], "Gold Medal");
            } else if (i == sortedScore.length - 2) {
                placeByScore.put(sortedScore[i], "Silver Medal");
            } else if (i == sortedScore.length - 3) {
                placeByScore.put(sortedScore[i], "Bronze Medal");
            } else {
                placeByScore.put(sortedScore[i], Integer.toString(sortedScore.length - i));
            }
        }
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = placeByScore.get(score[i]);
        }
        return result;
    }

}
