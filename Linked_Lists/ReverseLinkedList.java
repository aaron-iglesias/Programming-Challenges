// Reverse a singly linked list.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 public class ReverseLinkedList {
 	// Idea: Iteratively reverse pointers to point to previous node instead of next node
 	private ListNode reverseLinkedList(ListNode head) {
 		ListNode newHead = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
 	}
 }