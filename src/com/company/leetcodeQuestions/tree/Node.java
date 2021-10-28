package com.company.leetcodeQuestions.tree;

public class Node {

	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}

	public static void printInOrderTraversalTree(Node root){
		if(root==null)
			return ;

		printInOrderTraversalTree(root.left);
		System.out.println("value "+root.val);
		printInOrderTraversalTree(root.right);
	}

	public static Node createBinaryTree(int arr[]){
		Node root= new Node(arr[0]);
		return createBinaryTreeHelper(arr,1,root);
	}

	public static Node createBinaryTreeHelper(int arr[], int loc, Node root){
		if(loc<=arr.length) {
			Node temp = new Node(arr[loc - 1]);
			root = temp;

			root.left = createBinaryTreeHelper(arr, loc * 2, root.left);
			root.right = createBinaryTreeHelper(arr, loc * 2+1, root.right);
		}
		return root;

	}
}
