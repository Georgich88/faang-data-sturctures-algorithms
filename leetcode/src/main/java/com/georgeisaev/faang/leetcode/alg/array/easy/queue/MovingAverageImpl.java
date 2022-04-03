package com.georgeisaev.faang.leetcode.alg.array.easy.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageImpl implements MovingAverage {

    private final Deque<Integer> numbers;
    private int sum;
    private final int size;

    public MovingAverageImpl(int size) {
        numbers = new ArrayDeque<>(size);
        this.size = size;
    }

    @Override
    public double next(int val) {
        if (numbers.size() == size) {
            sum -= numbers.removeFirst();
        }
        numbers.addLast(val);
        sum += val;
        return (double) sum / numbers.size();
    }

}
