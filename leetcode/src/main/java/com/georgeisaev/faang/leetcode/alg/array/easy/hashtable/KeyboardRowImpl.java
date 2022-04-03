package com.georgeisaev.faang.leetcode.alg.array.easy.hashtable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class KeyboardRowImpl implements KeyboardRow {

    public static void main(String[] args) {
        new KeyboardRowImpl().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    }

    private static final Set<Integer> FIRST_ROW =
            Arrays.stream(new int[]{
                            'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
                            'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'})
                    .boxed()
                    .collect(Collectors.toSet());
    private static final Set<Integer> SECOND_ROW =
            Arrays.stream(new int[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                            'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'})
                    .boxed()
                    .collect(Collectors.toSet());
    private static final Set<Integer> THIRD_ROW =
            Arrays.stream(new int[]{
                            'z', 'x', 'c', 'v', 'b', 'n', 'm',
                            'Z', 'X', 'C', 'V', 'B', 'N', 'M'})
                    .boxed()
                    .collect(Collectors.toSet());

    @Override
    public String[] findWords(String[] words) {
        List<String> result = new LinkedList<>();
        for (var word : words) {
            if (word.chars().allMatch(FIRST_ROW::contains)
                    || word.chars().allMatch(SECOND_ROW::contains)
                    || word.chars().allMatch(THIRD_ROW::contains)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

}
