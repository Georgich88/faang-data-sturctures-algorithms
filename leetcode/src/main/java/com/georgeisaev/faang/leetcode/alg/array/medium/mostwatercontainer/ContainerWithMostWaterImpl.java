package com.georgeisaev.faang.leetcode.alg.array.medium.mostwatercontainer;

public class ContainerWithMostWaterImpl implements ContainerWithMostWater {

	@Override
	public int maxArea(int[] height) {
		int maxArea = -1;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

}
