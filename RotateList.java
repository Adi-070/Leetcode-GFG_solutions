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
    public ListNode rotateRight(ListNode head, int k) {

        if(k<=0 || head==null|| head.next==null)
        return head;

        ListNode temp = head;
        int c = 1;
        while(temp.next!=null)
        {
            temp = temp.next;
            c++;
        }
        temp.next = head;
        int rotations = k%c;
        int skip = c - rotations;
        ListNode newLast = head;

        for(int i =0; i< skip-1; i++)
        {
           newLast = newLast.next;

        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
