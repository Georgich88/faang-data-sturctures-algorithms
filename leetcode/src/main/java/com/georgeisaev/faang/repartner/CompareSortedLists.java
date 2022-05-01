package com.georgeisaev.faang.repartner;

import java.util.List;
import java.util.Objects;

public class CompareSortedLists {

    public static void main(String[] args) {
        System.out.println(new CompareSortedLists().compare(List.of(5, 2, 3), List.of(1, 2, 4, 5)));
    }

    /**
     * Compares two lists with following approach:
     * 1) Find first not the same element in both lists
     * 2) Return comparison result of this element
     * 3) If all elements are equal compare the length of the array
     *
     * @param first  first list
     * @param second second list
     * @return comparison resul
     */
    int compare(List<Integer> first, List<Integer> second) {
        if (first == second) {
            return 0;
        } else if (first == null) {
            return -1;
        } else if (second == null) {
            return 1;
        }
        int firstLength = first.size();
        int secondLength = second.size();
        int limit = Math.min(firstLength, secondLength);
        for (int i = 0; i < limit; i++) {
            if (!Objects.equals(first.get(i), second.get(i))) {
                return Integer.compare(first.get(i), second.get(i));
            }
        }
        return firstLength - secondLength;
    }

}


