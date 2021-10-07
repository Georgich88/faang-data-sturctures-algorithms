package com.georgeisaev.faang.leetcode.alg.array.easy.conversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Convert1DArrayInto2DArrayImplTest {

	Convert1DArrayInto2DArray algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new Convert1DArrayInto2DArrayImpl();
	}

	@Test
	void shouldConvert() {
		assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, algorithm.convert(new int[]{1, 2, 3, 4}, 2, 2));
		assertArrayEquals(new int[][]{{1, 2, 3}}, algorithm.convert(new int[]{1, 2, 3}, 1, 3));
		assertArrayEquals(new int[][]{}, algorithm.convert(new int[]{1, 2}, 1, 1));
		assertArrayEquals(new int[][]{}, algorithm.convert(new int[]{3}, 1, 2));
		assertArrayEquals(new int[][]{{1}, {1}, {1}, {1}}, algorithm.convert(new int[]{1, 1, 1, 1}, 4, 1));
	}

}

