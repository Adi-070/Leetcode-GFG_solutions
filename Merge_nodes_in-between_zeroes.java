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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode curr=dummy;

        if(head.next==null)
        return head;

        ListNode temp=head;
        int sum=0;

        while(temp!=null)
        {
            if(temp.val!=0)
            {
                sum += temp.val;
            }
            else
            {
            curr.next=new ListNode(sum);
            sum=0;
            curr=curr.next;
            }
            temp=temp.next;
        }
        return dummy.next.next;
    }
}
