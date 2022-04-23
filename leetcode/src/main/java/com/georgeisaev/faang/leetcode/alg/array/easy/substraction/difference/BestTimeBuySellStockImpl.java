package com.georgeisaev.faang.leetcode.alg.array.easy.substraction.difference;

public class BestTimeBuySellStockImpl implements BestTimeBuySellStock {

    @Override
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            if (price < minPrice) minPrice = price;
            int currentProfit = price - minPrice;
            if (maxProfit < currentProfit) maxProfit = currentProfit;
        }
        return maxProfit;
    }

}
