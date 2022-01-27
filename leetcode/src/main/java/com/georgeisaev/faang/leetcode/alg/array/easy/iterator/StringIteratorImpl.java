package com.georgeisaev.faang.leetcode.alg.array.easy.iterator;

public class StringIteratorImpl implements StringIterator {

    private final char[] chars;
    private int cursor;
    private int nextCursor;
    private int count;

    public StringIteratorImpl(String compressedString) {
        chars = compressedString.toCharArray();
        iterate();
    }

    @Override
    public char next() {
        if (hasNext()) {
            if (count <= 0) {
                count = 0;
                cursor = nextCursor;
                iterate();
            }
            count--;
            return chars[cursor];
        }
        return ' ';
    }

    @Override
    public boolean hasNext() {
        return nextCursor < chars.length || count > 0;
    }

    private void iterate() {
        nextCursor = cursor + 1;
        while (nextCursor < chars.length && chars[nextCursor] >= '0' && chars[nextCursor] <= '9') {
            count = count * 10 + chars[nextCursor] - '0';
            nextCursor++;
        }
    }

}
