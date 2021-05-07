package com.georgeisaev.faang.leetcode.alg.array.hard.twopointers;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWaterIntuitiveImpl implements TrappingRainWater {

	@Override
	public int trap(int[] height) {

		// Corner cases
		if (height.length == 0) {
			return 0;
		}
		int left = 0;
		List<Interval> intervals = new ArrayList<>();

		// Find traps
		for (int i = 1; i < height.length; i++) {
			if (height[i] >= height[left]) {
				if (i > left + 1) {
					intervals.add(new Interval(left, i));
				}
				left = i;
			}
		}
		if (height.length - 1 > left + 1) {
			intervals.add(new Interval(left, height.length - 1));
		}

		// Calculate volumes between traps
		int volume = 0;
		for (var interval : intervals) {
			int currentVolume = 0;
			if (height[interval.left] <= height[interval.right]) {
				left = height[interval.left];
				for (int i = interval.left + 1; i <= interval.right; i++) {
					if (height[i] >= left) {
						volume += currentVolume;
						currentVolume = 0;
						left = height[i];
					} else {
						currentVolume += left - height[i];
					}
				}
			} else {
				left = height[interval.right];
				for (int i = interval.right - 1; i >= interval.left; i--) {
					if (height[i] >= left) {
						volume += currentVolume;
						currentVolume = 0;
						left = height[i];
					} else {
						currentVolume += left - height[i];
					}
				}
			}

		}
		return volume;
	}

	static class Interval {

		int left;
		int right;

		public Interval(int left, int right) {
			this.left = left;
			this.right = right;
		}

	}

}
