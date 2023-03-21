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
    public void reorderList(ListNode head) {
        if(head==null || head.next == null)
        return;

        ListNode mid = middleNode(head);

        ListNode hf = head;
        ListNode hs = reverseList(mid);

        while(hf!=null && hs!=null)
        {
            ListNode temp1 = hf.next;
            hf.next = hs;
            hf = temp1;
            
            temp1 = hs.next;
            hs.next = hf;
            hs = temp1;

        }
        if(hf!=null)
        hf.next = null;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast !=null && fast.next!=null)
        {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;  
        ListNode current = head;
    
        
        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev; 
    }
}
