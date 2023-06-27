class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null)
        {
            if (temp.next.val==temp.val)
            {
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }
}

..............................................................


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
    public ListNode deleteDuplicates(ListNode head) {
        
        HashSet<Integer> set = new HashSet<>();

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(head!=null)
        {
            set.add(head.val);
            head=head.next;
        }

        ArrayList<Integer> list = new ArrayList(set);
        Collections.sort(list);
        
        for(int i: list)
        {
            curr.next = new ListNode(i);
            curr=curr.next;
        }

        return dummy.next;
    }
}
