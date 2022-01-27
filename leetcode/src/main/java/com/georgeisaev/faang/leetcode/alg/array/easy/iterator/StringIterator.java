package com.georgeisaev.faang.leetcode.alg.array.easy.iterator;

/**
 * a compressed string iterator. The given compressed string will be in the form of each letter followed by a
 * positive integer representing the number of this letter existing in the original uncompressed string.
 */
public interface StringIterator {

    /**
     * Returns the next character if the original string still has uncompressed characters, otherwise returns a white
     * space.
     *
     * @return the next character
     */
    char next();

    /**
     * Returns true if there is any letter needs to be uncompressed in the original string, otherwise returns false.
     *
     * @return if there is any letter needs
     */
    boolean hasNext();

}
