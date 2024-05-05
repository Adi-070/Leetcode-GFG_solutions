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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode temp1=list1;

        for(int i=0; i<a-1; i++)
        {
            temp=temp.next;
        }
        for(int i=0; i<=b; i++)
        {
            temp1=temp1.next;
        }
        temp.next=list2;

        ListNode curr=list2;

        while(curr.next!=null)
        curr=curr.next;
        System.out.println(temp1.val);
        curr.next=temp1;

        return list1;

    }
}
