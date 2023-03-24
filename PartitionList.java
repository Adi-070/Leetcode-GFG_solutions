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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();

        ListNode leftTail = left;
        ListNode rightTail = right;

        while(head!=null)
        {
            if(head.val < x)
            {
                leftTail.next=head;
                leftTail=leftTail.next;
            }
            else
            {
                rightTail.next=head;
                rightTail=rightTail.next;
            }
            head=head.next;
        }
        leftTail.next=right.next;
        rightTail.next=null;
        return left.next;
    }
}
.........................................................................
    
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
    
    ListNode before, after, i, j;
    
    public ListNode partition(ListNode head, int x) {
        
        if(head == null) return head;
        ListNode temp = head;
        
        // Traversing all the nodes to make two separate lists
        while(temp != null){
            addNode(temp.val, temp.val < x);
            temp = temp.next;
        }
        
        // Case if the list with smaller values has no items
        if(i == null) return after;
        
        // Else merge the lists
        else i.next = after;
        
        return before;
    }
    
    private void addNode(int val, boolean isLess){
        
        // Add node in smaller list (`before`)
        if(isLess){
            
            // Initialize the head of smaller list
            if(before == null){
                before = new ListNode(val);
                i = before;
            }
            
            // Add node at the end of list and move pointer `i` to the last node
            else{
                i.next = new ListNode(val);
                i = i.next;
            }
        }
        
        // Add node in greater list (`after`)
        else{
            
            // Initialize the head of greater list
            if(after == null){
                after = new ListNode(val);
                j = after;
            }
            
            // Add node at the end of list and move pointer `j` to the last node
            else{
                j.next = new ListNode(val);
                j = j.next;
            }
        }
    }
}
