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
    public ListNode doubleIt(ListNode head) {
        ListNode reversed=reverse(head);

        int carry=0;

        ListNode prev=null;
        ListNode curr=reversed;

        while(curr!=null)
        {
            int newNode = curr.val*2+carry;
            curr.val=newNode % 10;

            if(newNode>9)
            carry=1;

            else
            carry=0;

            prev=curr;
            curr=curr.next;
        }
        if(carry!=0)
        {
            ListNode extra=new ListNode(carry);
            prev.next=extra;
        }
        ListNode result=reverse(reversed);

        return result;
    }
    public ListNode reverse(ListNode head){

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null)
        {
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
