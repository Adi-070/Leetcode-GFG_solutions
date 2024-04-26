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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode temp=head;
        while(temp.next!=null)
        {
        if(temp.next!=null){
        ListNode curr=temp.next;
        temp.next=new ListNode(GCD(temp.val,temp.next.val));
        temp.next.next=curr;
        }
        temp=temp.next.next;
        }
      
        return head;
        
    }
    public int GCD(int a, int b)
    {
        for(int i=Math.max(a,b); i>1; i--)
        {
            if(a%i==0 && b%i==0)
            return i;
        }
        return 1;
    }
}
