package com.company.leetcodeQuestions.tree;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class NextRightPointerSolution {


		public Node connect(Node root) {

			if(root==null){
				return null;
			}
			root.next=null;
			if(root.left!=null)
				root.left.next=root.right;
			if(root.right!=null)
				root.right.next=connect(root.left);

			return root;
		}

	public static void main(String[] args) {
		Node.printInOrderTraversalTree(Node.createBinaryTree(new int[]{1,2,3,4,5,6,7}));

	}
}
