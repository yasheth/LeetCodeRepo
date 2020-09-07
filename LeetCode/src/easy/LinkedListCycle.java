package easy;

import structure.ListNode;

public class LinkedListCycle {

	public static ListNode reverseList(ListNode head) {
	    ListNode prev = null;
	    ListNode curr = head;
	    while (curr != null) {
	        ListNode nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	    }
	 
	public static void main(String[] args) {
		System.out.println(reverseList(new ListNode()));
	}
}