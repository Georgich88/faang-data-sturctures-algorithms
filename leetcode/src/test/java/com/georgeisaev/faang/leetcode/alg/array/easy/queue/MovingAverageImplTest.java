package com.georgeisaev.faang.leetcode.alg.array.easy.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovingAverageImplTest {


    @Test
    void shouldCalculateMovingAverage() {
        MovingAverage movingAverage = new MovingAverageImpl(3);
        Assertions.assertEquals(1.0, movingAverage.next(1)); // return 1.0 = 1 / 1
        Assertions.assertEquals(5.5, movingAverage.next(10)); // return 5.5 = (1 + 10) / 2
        Assertions.assertEquals(14.0 / 3.0, movingAverage.next(3)); // return 4.66667 = (1 + 10 + 3) / 3
        Assertions.assertEquals(6.0, movingAverage.next(5)); // return 6.0 = (10 + 3 + 5) / 3
    }

}