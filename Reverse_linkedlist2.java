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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for(int i=0; i<left-1;i++)
        {
            prev = prev.next;
    }
    ListNode current = prev.next;

    for(int i=0; i< right-left; i++)
    {
        
        ListNode forward = current.next;
        current.next= forward.next;
        forward.next = prev.next;
        prev.next = forward;
    }
    return dummy.next;
    }
}
