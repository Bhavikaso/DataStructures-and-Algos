package com.company.leetcodeQuestions.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ListToTree {
	int preorderIndex;
	Map<Integer, Integer> inorderIndexMap;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		preorderIndex = 0;
		// build a hashmap to store value -> its index relations
		inorderIndexMap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			inorderIndexMap.put(inorder[i], i);
		}

		return buildTreeHelper(preorder,inorder,0,preorder.length-1);

	}

	private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int left, int right) {

	// if there are no elements to construct the tree
		if (left > right) return null;

		// select the preorder_index element as the root and increment it
		int rootValue = preorder[preorderIndex++];
		TreeNode root = new TreeNode(rootValue);

		// build left and right subtree
		// excluding inorderIndexMap[rootValue] element because it's the root
		root.left = buildTreeHelper(preorder, inorder, left, inorderIndexMap.get(rootValue) - 1);
		root.right = buildTreeHelper(preorder, inorder, inorderIndexMap.get(rootValue) + 1, right);
		return root;
	}



}
