package insertionsortforlinkedlist;

public class InsertionSortForLinkedList {
	public static void sort(SinglyLinkedList list) {
		SinglyListNode head = list.getHeadNode();
		
		if(head == null) {
			return;
		}
		
		SinglyListNode currNode = head.next;
		SinglyListNode prevNode = head;
		
		while(currNode != null) {
			SinglyListNode tempCurrNode = head, tempPrevNode = null;
			
			while(tempCurrNode != currNode && tempCurrNode.data < currNode.data) {
				tempPrevNode = tempCurrNode;
				tempCurrNode = tempCurrNode.next;
			}
			
			if(tempCurrNode.data > currNode.data) {
				SinglyListNode nextNode = currNode.next;
				if(tempPrevNode == null) {
					//this case means that the data that currNode holds is less than
					//the head itself
					prevNode.next = nextNode;
					currNode.next = head;
					//we need to set the new header for the list
					head = currNode;
					
				} else {
					prevNode.next = nextNode;
					tempPrevNode.next = currNode;
					currNode.next = tempCurrNode;
				}
				//prevNode will remain the same as only we are de-linking the
				//currNode and placing it as the head.So, updating currNode
				//only
				currNode = nextNode;
			}
			else {
				//this case means that the element is in its correct position
				//in the sorted list items.Hence we move on to the next node 
				prevNode = currNode;
				currNode = currNode.next;
			}
		}
		list.setHeadNode(head);
	}
}	
