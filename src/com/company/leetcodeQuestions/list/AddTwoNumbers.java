package com.company.leetcodeQuestions.list;

import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int val1 = traverseListToDigit(l1);
		int val2 = traverseListToDigit(l2);

		int result= val1+val2;


		System.out.println("result"+result);
		char c[] = String.valueOf(result).toCharArray();


		ListNode head = new ListNode();
		ListNode curr = head;
		int i=0;
		while(i<c.length){
			curr.val=c[i]-'0';
			curr.next=new ListNode();
			i++;
		}

			return head;
		}

	public ListNode addTwoNumbers_diffApproach(ListNode l1, ListNode l2) {

		ListNode curr_l1=l1;
		ListNode curr_l2=l2;
		int cary=0;
		ListNode prev = new ListNode(0);
		while(curr_l1 !=null || curr_l2 !=null){

			int x= curr_l1!=null?curr_l1.val:0;
			int y= curr_l2!=null?curr_l2.val:0;
			int value =x+y+cary;

			if(value>9) {
				cary = value / 10;
				value = value % 10;
			}
			ListNode resultList = new ListNode();
			resultList.val=value;

			prev.next=resultList;
			prev=resultList;

			curr_l1=curr_l1.next;
			curr_l2=curr_l2.next;

		}

		return prev.next;



	}

	private int traverseListToDigit(ListNode l) {
		if(l==null)
			return 0;
		ListNode curr=l;
		String digit="";
		while(curr.next!=null){
			digit=digit+curr.val;
			curr=curr.next;

	}
		digit= new StringBuilder(digit).reverse().toString();
		return Integer.parseInt(digit);
}
}
