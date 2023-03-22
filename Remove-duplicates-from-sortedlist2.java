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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;

        while(prev.next!=null && prev.next.next!=null)
        {
            if(prev.next.val==prev.next.next.val)
            {
            int value = prev.next.val;
            
            while(prev.next!=null && prev.next.val==value)
            {
              prev.next=prev.next.next;
            }
        }
            else
            prev=prev.next;
        
        }
   return dummy.next;
    }
    
}
