package com.georgeisaev.faang.leetcode.alg.array.easy.search.shortestworddistance;

public class ShortestWordDistanceImpl implements ShortestWordDistance {

    @Override
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int firstPosition = -1;
        int secondPosition = -1;
        int shortestDistance = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                firstPosition = i;
            }
            if (wordsDict[i].equals(word2)) {
                secondPosition = i;
            }
            if (firstPosition != -1 && secondPosition != -1) {
                shortestDistance = Math.min(shortestDistance, Math.abs(firstPosition - secondPosition));
            }
        }
        return shortestDistance;
    }

}
