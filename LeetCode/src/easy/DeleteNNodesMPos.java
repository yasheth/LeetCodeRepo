package easy;

import structure.ListNode;

public class DeleteNNodesMPos {

	 public static ListNode deleteNodes(ListNode head, int m, int n) {
	        ListNode cur = head, pre = null;    // pre.next == cur
	        while (cur != null) {
	            int i = m, j = n;
	            
	            // find the m-th node as pre
	            while (cur != null && i > 0) {
	                pre = cur;
	                cur = cur.next;
	                i--;
	            }
	            
	            while (cur != null && j > 0) {
	                cur = cur.next;
	                j--;
	            }
	            pre.next = cur;     // delete n nodes
	            
	        }
	        return head;
	    }
	 
	public static void main(String[] args) {
		System.out.println(deleteNodes(new ListNode(),3,2));
	}
}