package com.georgeisaev.faang.leetcode.alg.array.easy.conversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlusOneImplTest {

	PlusOne algorithm;

	@BeforeEach
	void setUp() {
		algorithm = new PlusOneImpl();
	}

	@Test
	void shouldAdd() {
		Assertions.assertArrayEquals(new int[]{1, 2, 4}, algorithm.plusOne(new int[]{1, 2, 3}));
		Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, algorithm.plusOne(new int[]{4, 3, 2, 1}));
		Assertions.assertArrayEquals(new int[]{1}, algorithm.plusOne(new int[]{0}));
		Assertions.assertArrayEquals(new int[]{1, 0}, algorithm.plusOne(new int[]{9}));
	}

}
