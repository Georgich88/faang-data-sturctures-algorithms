package com.georgeisaev.faang.leetcode.alg.array.easy.tree.binarysearch;

/**
 * Explanation:
 * <p>
 * to make it high balanced we have to make sure that number of nodes in a left subtree and right three are the same.
 */
public class SortedArrayToBinarySearchTreeConversionImpl implements SortedArrayToBinarySearchTreeConversion {

	@Override
	public TreeNode sortedArrayToBST(int[] nums) {
		return createTreeNode(nums, 0, nums.length - 1);
	}

	TreeNode createTreeNode(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int middle = left + (right - left) / 2;
		TreeNode rootNode = new TreeNode(nums[middle]);
		rootNode.left = createTreeNode(nums, left, middle - 1);
		rootNode.right = createTreeNode(nums, middle + 1, right);
		return rootNode;
	}

}
