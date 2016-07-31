// Write a program to find the node at which the intersection of two singly linked lists begins.

// Notes:
// If the two linked lists have no intersection at all, return null.
// The linked lists must retain their original structure after the function returns.
// You may assume there are no cycles anywhere in the entire linked structure.
// Your code should preferably run in O(n) time and use only O(1) memory.

// Idea:
// find length of each list
// iterate head of longer list until it is same length as shorter list
// iterate both heads until they are equal references
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        int lenA = 0;
        int lenB = 0;
        while(tmpA != null) {
            ++lenA;
            tmpA = tmpA.next;
        }
        while(tmpB != null) {
            ++lenB;
            tmpB = tmpB.next;
        }
        while(lenA > lenB) {
            headA = headA.next;
            --lenA;
        }
        while(lenB > lenA) {
            headB = headB.next;
            --lenB;
        }
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}