package com.georgeisaev.faang.leetcode.alg.array.easy.pascal.triangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PascalTriangleRowRecursiveImplTest {

	PascalTriangleRow algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new PascalTriangleRowRecursiveImpl();
	}

	@Test
	void shouldFindCombination() {
		assertArrayEquals(new Integer[]{1}, algorithm.getRow(0).toArray(Integer[]::new));
		assertArrayEquals(new Integer[]{1, 1}, algorithm.getRow(1).toArray(Integer[]::new));
		assertArrayEquals(new Integer[]{1, 3, 3, 1}, algorithm.getRow(3).toArray(Integer[]::new));
		assertArrayEquals(new Integer[]{1, 4, 6, 4, 1}, algorithm.getRow(4).toArray(Integer[]::new));
		assertArrayEquals(new Integer[]{1, 5, 10, 10, 5, 1}, algorithm.getRow(5).toArray(Integer[]::new));
	}

}
