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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
        return head;
       ListNode temp = head;
       ListNode head1 = head.next;
       ListNode temp1 = head1;

       while(temp.next!=null && temp1.next!=null)
       {
           temp.next=temp1.next;
           temp=temp.next;

           temp1.next=temp.next;
           temp1=temp1.next;

       }
       temp.next=head1;
       return head;
    }
}
