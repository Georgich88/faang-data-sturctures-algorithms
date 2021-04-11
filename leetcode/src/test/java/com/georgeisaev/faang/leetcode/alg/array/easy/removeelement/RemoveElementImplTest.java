package com.georgeisaev.faang.leetcode.alg.array.easy.removeelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementImplTest {

	private RemoveElement algorythm;

	@BeforeEach
	void setUp() {
		algorythm = new RemoveElementImpl();
	}

	@Test
	void shouldRemoveElement1() {
		int[] nums = {3, 2, 2, 3};
		int[] expected = {2, 2};
		int result = algorythm.removeElement(nums, 3);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

	@Test
	void shouldRemoveElement2() {
		int[] nums = {0,1,2,2,3,0,4,2};
		int[] expected = {0, 1, 3, 0, 4};
		int result = algorythm.removeElement(nums, 2);
		for (int i = 0; i < result; i++) {
			assertEquals(expected[i], nums[i]);
		}
	}

}
