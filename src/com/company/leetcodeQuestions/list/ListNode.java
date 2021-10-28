package com.company.leetcodeQuestions.list;

public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }

		public static void printList(ListNode head){
			ListNode current = head;
			while (current!=null)
			{
				System.out.print(current.val+",");
				current=current.next;
			}
		}

		//make a list from an array
		public static ListNode addList(int arr[]){
			ListNode head = null ;
			ListNode prev = null ;
			for (int i = 0; i < arr.length; i++) {
				ListNode newNode = new ListNode(arr[i],null);
				if(i==0) {
					head = newNode;
					prev = newNode;
				}
				else {
					prev.next = newNode;
					prev = newNode;
				}

			}
			return head;
		}


}

