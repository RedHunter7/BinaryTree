package tugas2;

import tugas2.Node;

public class BinaryTree {
	private Node root;
	
	public BinaryTree(int value) {
		root = new Node(value);
	}
	
	public BinaryTree() {
		root = null;
	}
	
	public void insertTree(int value) {
		Node newTree = new Node(value);
		
		if (root == null) {
			root = newTree;
			return;
		}
		
		Node current = root;
		Node parent;
		while (true) {
			parent = current;
			boolean isLeft = true;
			
			if (value < current.data) {
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
		Node current = root;
		
		while (current.leftChild != null) {			
			current = current.leftChild;
		}
		
		return current;
	}
	
	public Node find(int value) {
		Node current = root;
		while(current.data != value) {
			if (value < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		
		return current;
	}
	
	public void delete(int value) {
		root = null;
	}
}
