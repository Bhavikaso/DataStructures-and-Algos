package com.company.leetcodeQuestions.bst;

import java.awt.desktop.AppReopenedEvent;
import java.util.Comparator;
import java.util.PriorityQueue;

import com.company.leetcodeQuestions.list.ListNode;
import com.company.leetcodeQuestions.tree.Node;


public class BSTFunctions {

	private TreeNode root =null;

	public void createBST(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			insertBST(root, arr[i]);
		}
	}

	private TreeNode insertBST(TreeNode root, int i) {
		if(root == null){
			root = new TreeNode(i,null,null);
			return root;
		}
		if(root.val>i)
			root.left = insertBST(root.left,i);
		else if(root.val<i)
			root.right = insertBST(root.right,i);
		return root;
	}

	public TreeNode searchBST(TreeNode root, int val){
		if(root==null)
			return root;
		if(root.val==val)
			return root;
		else if(root.val>val)
			return searchBST(root.left,val);
		else
			return searchBST(root.right,val);
	}

	/**
	 * This solution has a problem, here if left or right nodes of the root are null, then it breaks at line 51(if lines 47 and 48 are not there
	 * if lines 47 and 48 are there , then it breaks and sends true to line 53.--> This case is failing [5,4,6,null,null,3,7]--> here for root 4-> both
	 * left and right are null..The solution failing from GFG also for the same reason.
	 */
	public boolean isValidBST(Node root ){
		if(root==null){
			return true;
		}
		if(root.left==null && root.right == null){
			return true;
		}

		if ((root.left!=null && root.left.val<= root.val) || (root.right !=null && root.right.val>=root.val)) {
			return isValidBST(root.left) && isValidBST(root.right);
		}
		else
			return false;



	}

	/**
	 * In order successor of tree
	 */
		public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
			PriorityQueue<TreeNode> p_queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
			PriorityQueue<TreeNode> pQueue= inorderSuccessorHelper(root, p, p_queue);
			while(pQueue.size()>0 && pQueue.peek().val<=p.val)
				pQueue.poll();


			return pQueue.poll();

		}

	public PriorityQueue<TreeNode> inorderSuccessorHelper(TreeNode root, TreeNode p, PriorityQueue<TreeNode> pQueue) {

		/*if(root==null)
			return root;

		if(root.val==p.val)
			return root.right;
		if(root.left !=null && root.left.val == p.val)
			return root;

		if(root.val<p.val)
			inorderSuccessor(root.right,p);
		else
			inorderSuccessor(root.left,p);

		return null;*/

		//for every inorder traversal --> if root == val, return prev
		if(root==null)
			return pQueue;
		if (root.left != null)
			inorderSuccessorHelper(root.left,p,pQueue);
		pQueue.add(root);
		System.out.println("pqueue added "+root.val);
		if (root.right != null)
			inorderSuccessorHelper(root.right,p,pQueue);

		return pQueue;

	}
}
