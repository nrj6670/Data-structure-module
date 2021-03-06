package com.app.core.binarysearchtree;

class MyContainer {
	int index;
	int [] arr;
	
	public MyContainer(int size) {
		this.index = 0;
		this.arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = -1;
		}
	}
}

public class BinarySearchTree implements BinarySearchTreeIntf {
	BinaryTreeNode root;
	
	private BinaryTreeNode insertHelper(BinaryTreeNode root, int element) {
		if(root == null) {
			return new BinaryTreeNode(element);
		}
		
		if(root.data > element) {
			root.lChild = insertHelper(root.lChild, element);
		} else if(root.data < element) {
			root.rChild = insertHelper(root.rChild, element);
		} 
		
		return root;
	}
	
	@Override
	public void Insert(int element) {
		root = insertHelper(root, element);
	}
	
	private BinaryTreeNode getReplacementNode(BinaryTreeNode node) {
		if(node.rChild == null) {
			return node;
		}
		
		return getReplacementNode(node.rChild);
	}
	
	private BinaryTreeNode deleteBSTNode(BinaryTreeNode root, int element) {
		if(root == null) {
			return null;
		}
		
		if(root.data == element) {
			if(root.lChild == null && root.rChild == null) {
				return null;
			} else if(root.lChild != null && root.rChild == null) {
				return root.lChild;
			} else if(root.lChild == null && root.rChild != null) {
				return root.rChild;
			} else {
				//in case the node has both the children, then the right most 
				//node in the left subtree will be the replacement.
				//The value of the right most node of left subtree is the 
				//the greatest value in the left subtree and also will be smaller
				//than the value of all nodes in the right subtree
				
				BinaryTreeNode replacementNode = getReplacementNode(root.lChild);
				
				//copying the data of rightmost node of left subtree 
				root.data = replacementNode.data;
				
				//calling delete function on left subtree so as to delete the
				//replacement node
				root.lChild = deleteBSTNode(root.lChild, replacementNode.data);
				
				return root;
			}
			
		} else if(root.data > element) {
			root.lChild = deleteBSTNode(root.lChild, element);
		} else {
			root.rChild = deleteBSTNode(root.rChild, element);
		}
		
		return root;
	}

	@Override
	public void Delete(int element) {
		root = deleteBSTNode(root, element);
	}
	
	private boolean searchHelper(BinaryTreeNode root, int element) {
		if(root == null) {
			return false;
		}
		
		if(root.data == element) {
			return true;
		} else if(root.data > element) {
			return searchHelper(root.lChild, element);
		} else {
			return searchHelper(root.rChild, element);
		}
	}

	@Override
	public boolean Search(int element) {
		return searchHelper(root, element);
	}
	
	private void inOrderHelper(BinaryTreeNode root, MyContainer container) {
		if(root == null) {
			return;
		}
		
		inOrderHelper(root.lChild, container);
		container.arr[container.index] = root.data;
		container.index += 1;
		inOrderHelper(root.rChild, container);	
	}

	@Override
	public int[] InOrder() {
		int size = getCountOfNodes(root);
		MyContainer container = new MyContainer(size);
		inOrderHelper(root, container);
		return container.arr;
	}
	
	public int getCountOfNodes(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		return 1 + getCountOfNodes(root.lChild) + getCountOfNodes(root.rChild);
	}

}
