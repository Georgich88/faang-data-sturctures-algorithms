package com.georgeisaev.faang.leetcode.alg.array.easy.substraction.difference;

public class BestTimeBuySellStockImpl implements BestTimeBuySellStock {

    @Override
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if ((prices[i] - minPrice) > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

}
