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
		assertArrayEquals(new Integer[]{1, 33, 528, 5456, 40920, 237336, 1107568, 4272048, 13884156, 38567100,
				92561040, 193536720, 354817320, 573166440, 818809200, 1037158320, 1166803110, 1166803110, 1037158320,
				818809200, 573166440, 354817320, 193536720, 92561040, 38567100, 13884156, 4272048, 1107568, 237336,
				40920, 5456, 528, 33, 1}, algorithm.getRow(33).toArray(Integer[]::new));
	}

}
