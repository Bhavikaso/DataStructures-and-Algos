package com.company.leetcodeQuestions.list;

public class ReverseSinglyList {

	public static ListNode reverseList(ListNode head){
		return  reverseListHelper(head, head);
	}

	private static ListNode reverseListHelper(ListNode head,ListNode first) {
		if(head.next==null)
			return head;
		if(first.next.next==null)
			return first;
		else {
			reverseListHelper(head,first.next);
			first.next=first;

		}
		head=first.next;
		return head;
	}


	public static void main(String args[]){
		int [] listElements= {1,2,3,4,5,6};
		ListNode newListHead = ListNode.addList(listElements);
		ListNode.printList(newListHead);
		System.out.println();
		ListNode.printList(reverseList(newListHead));


	}
}
