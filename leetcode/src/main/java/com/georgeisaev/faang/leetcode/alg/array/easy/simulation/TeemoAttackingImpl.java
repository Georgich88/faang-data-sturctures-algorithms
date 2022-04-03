package com.georgeisaev.faang.leetcode.alg.array.easy.simulation;

public class TeemoAttackingImpl implements TeemoAttacking {

    public static void main(String[] args) {
        new TeemoAttackingImpl().findPoisonedDuration(new int[]{1, 4}, 2);
    }

    @Override
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 1) {
            return duration;
        }
        int total = 0;
        int timeEnd = timeSeries[0] + duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            total += (timeEnd > timeSeries[i+1]) ? timeSeries[i+1] - timeSeries[i] : timeEnd - timeSeries[i];
            timeEnd = timeSeries[i+1] + duration;
        }
        total += timeEnd - timeSeries[timeSeries.length - 1];
        return total;
    }

}
