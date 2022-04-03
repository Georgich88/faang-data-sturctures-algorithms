package com.georgeisaev.faang.leetcode.alg.array.easy.queue;

/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 */
public interface MovingAverage {

    /**
     * Returns the moving average of the last size values of the stream.
     *
     * @param val next value
     * @return the moving average of the last size values of the stream
     */
    double next(int val);

}
