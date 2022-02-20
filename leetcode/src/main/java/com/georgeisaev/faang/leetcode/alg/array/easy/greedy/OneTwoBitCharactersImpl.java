package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

public class OneTwoBitCharactersImpl implements OneTwoBitCharacters {

    @Override
    public boolean isOneBitCharacter(int[] bits) {
        int i;
        for (i = 0; i < bits.length - 1; i++) {
            if (bits[i] == 1) {
                i += 1;
            }
        }
        return i == bits.length - 1;

    }

}
