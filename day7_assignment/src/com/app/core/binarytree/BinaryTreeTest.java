package com.app.core.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	@Test
	void testPreOrder() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		/*
		 			1
		 		  /   \
		 		 2     3
		 		/
		 	   4
		 	   pre order traversal : 1 2 4 3
		*/
		int[] traversalResult = bt.PreOrder();
		int[] preOrderArr = {1,2,4,3};
		
		boolean isPreOrder = true;
		System.out.println(Arrays.toString(traversalResult));
		
		for(int i=0; i<preOrderArr.length; i++) {
			if(preOrderArr[i] != traversalResult[i]) {
				isPreOrder = false;
				break;
			}
		}

		assertTrue(isPreOrder);
	}
	
	
	@Test
	void testPostOrder() {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.lChild = new BinaryTreeNode(2);
		tree.root.rChild = new BinaryTreeNode(3);
		tree.root.lChild.rChild = new BinaryTreeNode(4);
		tree.root.rChild.lChild = new BinaryTreeNode(5);
		tree.root.rChild.rChild = new BinaryTreeNode(6);
		/*
		 				1
		 			  /	   \
		  			 2      3
		  			 \	   /  \
		  			  4   5    6
		  			  
		  	post order : 4 2 5 6 3 1
		*/
		
		int size = tree.GetNodesCount();
		int [] postOrderArray = {4, 2, 5, 6, 3, 1};
		int [] postOrderResult = tree.PostOrder();
		
		boolean isPostOrder = true;
		
		for(int i=0; i<postOrderArray.length; i++) {
			if(postOrderArray[i] != postOrderResult[i]) {
				isPostOrder = false;
				break;
			}
		}
		assertTrue(size == postOrderArray.length && isPostOrder);
	}
	
	@Test
	void testHeight() {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.lChild = new BinaryTreeNode(2);
		tree.root.rChild = new BinaryTreeNode(3);
		tree.root.lChild.rChild = new BinaryTreeNode(4);
		tree.root.rChild.lChild = new BinaryTreeNode(5);
		tree.root.rChild.rChild = new BinaryTreeNode(6);
		tree.root.lChild.rChild.lChild = new BinaryTreeNode(7);
		/*
			1
		  /	   \
		 2      3
		 \	   /  \
		  4   5    6
		 /
		7
		height = 4
		 */
		
		int heightOfTree = tree.Height();
		assertTrue(heightOfTree == 4);
	}
	
	@Test
	void testFrequency() {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.lChild = new BinaryTreeNode(2);
		tree.root.rChild = new BinaryTreeNode(3);
		tree.root.lChild.rChild = new BinaryTreeNode(2);
		tree.root.rChild.lChild = new BinaryTreeNode(5);
		tree.root.rChild.rChild = new BinaryTreeNode(6);
		tree.root.lChild.rChild.lChild = new BinaryTreeNode(2);
		/*
				1
	  		/	   \
	 		2      3
	 		\	   /  \
	  		2   5    6
	 		/
		   2
			freq(2)= 3
	 */		
		int freq = tree.FindFrequency(2);
		assertTrue(freq == 3);
	}
	
	@Test
	void testCountOfLeafNode() {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.lChild = new BinaryTreeNode(2);
		tree.root.rChild = new BinaryTreeNode(3);
		tree.root.lChild.rChild = new BinaryTreeNode(4);
		tree.root.rChild.lChild = new BinaryTreeNode(5);
		tree.root.rChild.rChild = new BinaryTreeNode(6);
		tree.root.lChild.rChild.lChild = new BinaryTreeNode(7);
		/*
			1
		  /	   \
		 2      3
		 \	   /  \
		  4   5    6
		 /
		7
		left nodes = 3
	   */
		
		int leafNodeCount = tree.CountLeafNodes();
		//System.out.println("leaf nodes : " + leafNodeCount);
		assertTrue(leafNodeCount == 3);
	}
	
	@Test
	void testMirrorTree() {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.lChild = new BinaryTreeNode(2);
		tree.root.rChild = new BinaryTreeNode(3);
		tree.root.lChild.rChild = new BinaryTreeNode(4);
		tree.root.rChild.lChild = new BinaryTreeNode(5);
		tree.root.rChild.rChild = new BinaryTreeNode(6);
		tree.root.lChild.rChild.lChild = new BinaryTreeNode(7);
		/*
			1							1
		  /	   \					  /   \
		 2      3		->			 3     2
		 \	   /  \					/ \   /  
		  4   5    6			   6   5 4
		 /								  \
		7								  7
	post order : 7 4 2 5 6 3 1		post order : 6 5 3 7 4 2 1
	   */
		tree.MakeMirror();
		
		int [] postOrderArr = {6, 5, 3, 7, 4, 2, 1};
		int [] postOrderResult = tree.PostOrder();
		boolean isMirrored = true;
		
		for(int i=0; i<postOrderArr.length; i++) {
			if(postOrderArr[i] != postOrderResult[i]) {
				isMirrored = false;
				break;
			}
		}
		
		assertTrue(isMirrored);
	}
	
	@Test 
	void testInOrderTraversal() {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.lChild = new BinaryTreeNode(2);
		tree.root.rChild = new BinaryTreeNode(3);
		tree.root.lChild.rChild = new BinaryTreeNode(4);
		tree.root.rChild.lChild = new BinaryTreeNode(5);
		tree.root.rChild.rChild = new BinaryTreeNode(6);
		tree.root.lChild.rChild.lChild = new BinaryTreeNode(7);
		/*
			1
		  /	   \
		 2      3
		 \	   /  \
		  4   5    6
		 /
		7
		in order traversal : 2 7 4 1 5 3 6 
	   */
		
		int [] inOrderArr = {2, 7, 4, 1, 5, 3, 6};
		int [] inOrderResult = tree.InOrder();
		
		//System.out.println(Arrays.toString(inOrderResult));
		
		boolean isInOrder = true;
		
		for(int i=0; i<inOrderArr.length; i++) {
			if(inOrderArr[i] != inOrderResult[i]) {
				isInOrder = false;
				break;
			}
		}
		
		assertTrue(isInOrder);
	}

}
