package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

import java.util.Arrays;

public class AssignCookiesImpl implements AssignCookies {

    @Override
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentSize = 0;
        for(int i = 0, j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j]) {
                contentSize++;
                i++;
            }
        }
        return contentSize;
    }

}
