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
    public boolean isPalindrome(ListNode head) {
        //Checking for special case when LL has only one node
        if( head.next==null){
            return true;
        }
        //Step 1- find Middle node
        ListNode midNode= middleNode ( head);  //calling function middleNode

        //Step2 - Reverse second half of the linkedlist

        ListNode prev = null;
        ListNode curr= midNode;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        
        ListNode left = head;    
        ListNode right = prev;   //rightmost element is prev as curr becomes equal to null

        //Step 3- check left and right values for palindrome

        while(right!= null){
            if (right.val != left.val){  
                return false;   
            }
            left= left.next;
            right= right.next;
        }
        return true;
        
    }

    // Defining helper function to find middle node using slow-fast approach
    public ListNode middleNode (ListNode head) {
        ListNode slow= head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow= slow.next;  //+1 i.e. moves by 1 step
            fast= fast.next.next;    //+2  i.e. moves by two steps
        }

        return slow;    //when fast reaches end of the LL , slow reaches middlenode of the ll i.e. slow is the  middlenode of the LL
    }


}
