package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public void isSymmetric(TreeNode root) {
		ArrayList<TreeNode> level = new ArrayList<TreeNode>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		BFS(level, q, root);
	}

	public void BFS(ArrayList<TreeNode> level, Queue<TreeNode> q, TreeNode node) {
		q.add(node);
		while (!q.isEmpty()) {
			TreeNode n = q.peek();
			q.poll();
			level.add(n);
			if (n != null) {
				if (n.left != null || n.right != null) {
					q.add(n.left);
					q.add(n.right);
				}
			}

		}
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(4);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(3);
		node.isSymmetric(node);
	}
}
