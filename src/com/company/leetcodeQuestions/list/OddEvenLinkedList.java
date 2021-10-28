package com.company.leetcodeQuestions.list;

public class OddEvenLinkedList {

	public static ListNode oddEvenList(ListNode head) {

		if(head==null)
			return null;

		if(head.next==null || head.next.next==null)
			return head;

		//one pointer for odd
		ListNode oddPointer = head.next.next;
		ListNode evenPointer = head.next;


		ListNode newList = head;
		ListNode curr = newList;

		while ( oddPointer!=null && oddPointer.next!=null && oddPointer.next.next!=null){
			ListNode lsOdd = oddPointer;
			curr.next=lsOdd;
			curr =curr.next;
			ListNode.printList(curr);
			oddPointer=oddPointer.next.next;
		}

		while (evenPointer!=null && evenPointer.next!=null && evenPointer.next.next!=null){
			ListNode lsEven = evenPointer;
			curr.next=lsEven;
			curr=curr.next;
			ListNode.printList(curr);
			evenPointer=evenPointer.next.next;

		}



		return curr;

	}

	public static void main(String args[]){
		int [] listElements= {1,2,3,4,5};
		ListNode newListHead = ListNode.addList(listElements);
		ListNode.printList(newListHead);
		System.out.println();
		ListNode.printList(oddEvenList(newListHead));

	}
}
