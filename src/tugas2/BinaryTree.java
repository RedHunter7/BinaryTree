package tugas2;

import tugas2.Node;

public class BinaryTree {
	private Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void insertTree(int value) {
		Node newTree = new Node(value);
		if (root == null) {
			root = new Node(0);
		}
		
		Node current = root;
		Node parent = current;
		boolean isLeft = true;
		
		if (value % 2 == 0) {
			current = current.leftChild;
		} else {
			isLeft = false;
			current = current.rightChild;
		}
		
		
		if (current == null && isLeft) {
			parent.leftChild = newTree;
			return;
		}
		
		if (current == null && !isLeft) {
			parent.rightChild = newTree;
			return;
		}
		
		while (true) {
			parent = current;
			
			if (value < current.data) {
				isLeft = true;
				current = current.leftChild;
			} else {
				isLeft = false;
				current = current.rightChild;
			}
			
			if (current == null && isLeft) {
				parent.leftChild = newTree;
				return;
			}
			
			if (current == null && !isLeft) {
				parent.rightChild = newTree;
				return;
			}
		}
	}
	
	public Node getMinimum() {
		if (root == null) {
			System.out.println("binary tree kosong");
			return null;
		}
		
		Node left = root.leftChild;
		Node right = root.rightChild;
		
		if (left != null) {
			while (left.leftChild != null) {			
				left = left.leftChild;
			}
		}
		
		if (right != null) {
			while (right.leftChild != null) {			
				right = right.leftChild;
			}
		}
		
		Node min = null;
		if (left != null && right != null) {
			if (left.data < right.data) {
				min = left;
			} else min = right;
		}
		
		if (left == null) min = right;
		else if (right == null) min = left;
		
		return min;
	}
	
	public Node find(int value) {
		if (root == null) {
			System.out.println("binary tree kosong");
			return null;
		}
		
		Node current = root;
		// System.out.println(current.data);
		if (value % 2 == 0) {
			current = current.leftChild;
			// System.out.println(current.data);
		} else {
			current = current.rightChild;
		}
		
		if (current == null) {
			System.out.println("tidak ditemukan");
			return null;
		}
		
		while(current.data != value) {
			if (value < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			
			if (current == null) {
				System.out.println("tidak ditemukan");
				break;
			}
		}
		
		return current;
	}
	
	public void delete() {
		root = null;
	}
}
