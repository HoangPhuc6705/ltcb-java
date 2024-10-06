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

	public boolean isSymmetric(TreeNode root) {
		ArrayList<TreeNode> level = new ArrayList<TreeNode>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		BFS(level, q, root);
		int start = 1;
		int end = 2;
		ArrayList<ArrayList<TreeNode>> B_Tree = new ArrayList<ArrayList<TreeNode>>();
		int index = 0;
		while (end <= level.size()) {
			B_Tree.add(new ArrayList<TreeNode>());
			for (int i = start; i <= end; ++i) {
				B_Tree.get(index).add(level.get(i));
			}
			start = end + 1;
			end = (end + 1) * 2;
			++index;
		}
		
		for (int i = 0; i < B_Tree.size(); ++i) {
			ArrayList<TreeNode> reverseList = new ArrayList<TreeNode>(B_Tree.get(i));
			Collections.reverse(reverseList);
			for (int j = 0; j < B_Tree.get(i).size(); ++j) {
				TreeNode a = B_Tree.get(i).get(j);
				TreeNode b = reverseList.get(j);
				
				if (a == null && b != null || a != null && b == null) {
					return false;
				}
				
				if (a.val != b.val) {
					return false;
				}
			}
		}
		
		
		return true;
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
		System.out.println(node.isSymmetric(node));
	}
}
