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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = new ListNode();
        if(head.next==null)return null;
        if(head.next.next==null){
            head.next = null;
            return head;
        }

        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
