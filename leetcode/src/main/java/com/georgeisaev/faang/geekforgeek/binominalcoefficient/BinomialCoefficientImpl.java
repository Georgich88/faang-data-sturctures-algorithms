package com.georgeisaev.faang.geekforgeek.binominalcoefficient;

public class BinomialCoefficientImpl implements BinomialCoefficient {

    @Override
    public int binomialCoefficient(int n, int k) {
        int[][] binomialCoefficients = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    binomialCoefficients[i][j] = 1;
                } else {
                    binomialCoefficients[i][j] = binomialCoefficients[i - 1][j - 1] + binomialCoefficients[i - 1][j];
                }
            }
        }
        return binomialCoefficients[n][k];
    }

}
