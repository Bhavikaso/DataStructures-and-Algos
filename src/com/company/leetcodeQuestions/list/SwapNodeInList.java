package com.company.leetcodeQuestions.list;

import com.company.leetcodeQuestions.list.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class SwapNodeInList {
	public static ListNode swapPairs(ListNode head) {
		return swapPairsHelper(head,head,null,head);
	}

	public static  ListNode swapPairsHelper(ListNode originalHead, ListNode newHead, ListNode prev, ListNode current) {
		if(originalHead==null)
			return null;
		else if(originalHead.next==null)
			return originalHead;
		else if(current==null || current.next==null)
			return newHead;
		else{
			//swap nodes
			if(current==originalHead) {
				newHead=current.next;
				current.next=current.next.next;
				newHead.next=current;
				prev=newHead.next;
				current=prev.next;

			}
			else {
				prev.next = current.next;
				current.next=current.next.next;
				prev.next.next=current;
				prev = current;
				current = prev.next;

			}
			swapPairsHelper(originalHead, newHead, prev, current);

		}
		ListNode.printList(newHead);
		return newHead;

	}

	public static void main(String args[]){
		int [] listElements= {1,2,3,4,5,6};
		ListNode newListHead = ListNode.addList(listElements);
		ListNode.printList(newListHead);
		System.out.println();
		swapPairs(newListHead);


	}



}

