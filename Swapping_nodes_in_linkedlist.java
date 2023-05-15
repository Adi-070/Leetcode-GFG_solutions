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
    public ListNode swapNodes(ListNode head, int k) {
        int c=1;

        ListNode temp = head;

        while(temp.next!=null)
        {   
        temp=temp.next;
           c++;
        }

        ListNode first=head;
        ListNode second=head;

        for(int i=0; i<k-1; i++)
        {
            first=first.next;
        }
        for(int i=0; i<c-k;i++)
        {
            second=second.next;
        }

        int t=first.val;
        first.val=second.val;
        second.val=t;

        return head;
    }
}
