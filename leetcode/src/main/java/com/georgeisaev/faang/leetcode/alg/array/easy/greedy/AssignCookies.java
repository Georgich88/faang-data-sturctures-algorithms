package com.georgeisaev.faang.leetcode.alg.array.easy.greedy;

/**
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at
 * most one cookie.
 * <p>
 * Each child {@code i} has a greed factor {@code g[i]}, which is the minimum size of a cookie that the child will be
 * content with; and each cookie {@code j} has a size {@code s[j]}. If {@code s[j] >= g[i]}, we can assign the cookie
 * {@code j} to the child {@code i}, and the child {@code i} will be content. Your goal is to maximize the number of
 * your content children and output the maximum number.
 */
public interface AssignCookies {

    int findContentChildren(int[] g, int[] s);

}
