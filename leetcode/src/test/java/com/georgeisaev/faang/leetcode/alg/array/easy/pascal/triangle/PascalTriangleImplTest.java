package com.georgeisaev.faang.leetcode.alg.array.easy.pascal.triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PascalTriangleImplTest {

	PascalTriangle algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new PascalTriangleImpl();
	}

	@Test
	void shouldAdd() {
		Assertions.assertArrayEquals(new Integer[][]{{1}},
				algorithm.generate(1).stream()
						.map(array -> array.toArray(Integer[]::new))
						.toArray(Integer[][]::new));
		Assertions.assertArrayEquals(new Integer[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}},
				algorithm.generate(5).stream()
						.map(array -> array.toArray(Integer[]::new))
						.toArray(Integer[][]::new));

	}

}
