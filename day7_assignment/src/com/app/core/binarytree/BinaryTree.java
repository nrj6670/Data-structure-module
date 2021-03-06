package com.app.core.binarytree;

class MyContainer {
	int index;
	int [] arr;
	
	public MyContainer(int size) {
		this.index = 0;
		this.arr = new int[size];
	}
}

public class BinaryTree implements BinaryTreeIntf {
	BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	private void preOrderHelper(BinaryTreeNode root, MyContainer container) {
		if(root == null) {
			return;
		}
		container.arr[container.index] = root.data;
		container.index += 1;
		preOrderHelper(root.lChild, container);
		preOrderHelper(root.rChild, container);
	}

	@Override
	public int[] PreOrder() {
		int size = GetNodesCount();
		MyContainer container = new MyContainer(size);
		preOrderHelper(root, container);
		return container.arr;
	}

	public int[] BuildTreeForPreOrder() {
		int[] element = new int[4];
		element[0] = 1;
		element[1] = 2;
		element[2] = 4;
		element[3] = 3;

		root = new BinaryTreeNode(1);
		root.lChild = new BinaryTreeNode(2);
		root.rChild = new BinaryTreeNode(3);
		root.lChild.lChild = new BinaryTreeNode(4);

		return element;
	}
	
	private void postOrderHelper(BinaryTreeNode root, MyContainer container) {
		if(root == null) {
			return;
		}
		
		postOrderHelper(root.lChild, container);
		postOrderHelper(root.rChild, container);
		container.arr[container.index] = root.data;
		container.index += 1;
	}

	@Override
	public int[] PostOrder() {
		int size = GetNodesCount();
		MyContainer container = new MyContainer(size);
		postOrderHelper(root, container);
		return container.arr;
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
		int size = GetNodesCount();
		MyContainer container = new MyContainer(size);
		inOrderHelper(root, container);
		return container.arr;
	}
	
	private int getNodesCountUtil(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int size = 1;
		
		size += getNodesCountUtil(root.lChild);
		size += getNodesCountUtil(root.rChild);
		
		return size;
	}

	@Override
	public int GetNodesCount() {
		return getNodesCountUtil(root);
	}
	
	private int getTreeHeight(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		return 1 + Math.max(getTreeHeight(root.lChild) ,  getTreeHeight(root.rChild));
	}

	@Override
	public int Height() {
		return getTreeHeight(root);
	}
	
	private int findFrequencyHelper(BinaryTreeNode root, int element) {
		if(root == null) {
			return 0;
		}
		
		int counter = 0;
		
		if(root.data == element) {
			counter += 1;
		}
		
		return counter + findFrequencyHelper(root.lChild, element)
						+ findFrequencyHelper(root.rChild, element);
	}

	@Override
	public int FindFrequency(int element) {
		return findFrequencyHelper(root, element);
	}
	
	private int countLeafNodesHelper(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		if(root.lChild == null && root.rChild == null) {
			return 1;
		}
		
		return countLeafNodesHelper(root.lChild) 
				+ countLeafNodesHelper(root.rChild);
	}

	@Override
	public int CountLeafNodes() {
		return countLeafNodesHelper(root);
	}
	
	private void makeMirrorTreeHelper(BinaryTreeNode root) {
		if(root == null) {
			return;
		}
		makeMirrorTreeHelper(root.lChild);
		makeMirrorTreeHelper(root.rChild);
		BinaryTreeNode temp = root.lChild;
		root.lChild = root.rChild;
		root.rChild = temp;
	}

	@Override
	public int MakeMirror() {
		makeMirrorTreeHelper(root);
		return 1;
	}
}
