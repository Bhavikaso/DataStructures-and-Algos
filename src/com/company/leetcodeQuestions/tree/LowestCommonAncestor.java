package com.company.leetcodeQuestions.tree;

class LowestCommoclass {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

			if(p.val < q.val)
				return checkParent(root,p.val);
			else
				return checkParent(root,q.val);
		}


		public TreeNode checkParent(TreeNode root, int a){
			if(root==null)
				return null;
			if(root.left.val==a)
				if(root.left.val<root.val)
					return root;
				else
					return root.left;

			if(a>root.val)
				return checkParent(root.right,a);
			else
				return checkParent(root.left,a);
		}
}
