package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

public class CanPlaceFlowersImpl implements CanPlaceFlowers {

    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Corner cases
        if (n == 0) {
            return true;
        }
        // First element checking
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            return n <= 0;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }
        // Middle element checking
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (n <= 0) {
                return true;
            }
        }
        // Last element checking
        if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }
        return n <= 0;
    }

}
